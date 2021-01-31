package sk.itsovy.dolinsky.afterreturning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sk.itsovy.dolinsky.afterreturning.Account;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
@Order(2)
public class LoggingAspect {
	@AfterReturning(
			pointcut = "execution(* sk.itsovy.dolinsky.afterreturning.dao.AccountDAO.findAccounts(..))",
			returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {

		String method = theJoinPoint.getSignature().toShortString();

		System.out.println("\n====>>> Executing @AfterReturning on method: " + method);
		System.out.println("\n====>>> Result is: " + result);

		convertAccountNamesToUpperCase(result);
		System.out.println("\n====>>> Result is: " + result);

	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		for (Account tempAccount : result) {
			String theUpperName = tempAccount.getName().toUpperCase();
			tempAccount.setName(theUpperName);
		}
	}

	//@Before("execution(public void Add*())")
	@Before("sk.itsovy.dolinsky.afterreturning.aspect.LuvAopExpressions.forDaoPackageNoGetterAndSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n =====>>> Executing @Before advice on method...");

		MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("METHOD: " + methodSignature);
		Object[] args = theJoinPoint.getArgs();
		for (Object tempArg : args) {
			System.out.println(tempArg);
			if (tempArg instanceof Account) {
				Account account = (Account) tempArg;
				System.out.println("Account Name: " + account.getName());
				System.out.println("Account Level: " + account.getLevel());
			}
		}

	}


}

