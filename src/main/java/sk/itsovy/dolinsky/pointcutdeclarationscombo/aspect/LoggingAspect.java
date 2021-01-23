package sk.itsovy.dolinsky.pointcutdeclarationscombo.aspect;

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

	@Pointcut("execution(* sk.itsovy.dolinsky.pointcutdeclarationscombo.dao.*.*(..))")
	private void forDaoPackage() {
	}

	@Pointcut("execution(* sk.itsovy.dolinsky.pointcutdeclarationscombo.dao.*.get*(..))")
	private void getter() {
	}

	@Pointcut("execution(* sk.itsovy.dolinsky.pointcutdeclarationscombo.dao.*.set*(..))")
	private void setter() {
	}

	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {
	}


	//	@Before("execution(public void add*())")
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on method");
	}

	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n======>>> Performing API Analytics");
	}
}
