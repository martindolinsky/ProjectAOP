package sk.itsovy.dolinsky.pointcutdeclarations.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* sk.itsovy.dolinsky.pointcutdeclarations.dao.*.*(..))")
	private void forDacoPackage() {

	}

	//	@Before("execution(public void add*())")
	@Before("forDacoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on method");
	}

	@Before("forDacoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n======>>> Performing API Analytics");
	}
}
