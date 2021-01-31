package sk.itsovy.dolinsky.pointcutorderaspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
@Order(2)
public class LoggingAspect {

	//	@Before("execution(public void add*())")
	@Before("sk.itsovy.dolinsky.pointcutorderaspects.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on method");
	}

}
