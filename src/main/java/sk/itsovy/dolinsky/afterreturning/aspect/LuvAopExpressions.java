package sk.itsovy.dolinsky.afterreturning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Martin Dolinsky
 */
@Aspect
public class LuvAopExpressions {

	@Pointcut("execution(* sk.itsovy.dolinsky.afterreturning.dao.*.*(..))")
	public void forDaoPackage() {
	}

	@Pointcut("execution(* sk.itsovy.dolinsky.afterreturning.dao.*.get*(..))")
	public void getter() {
	}

	@Pointcut("execution(* sk.itsovy.dolinsky.afterreturning.dao.*.set*(..))")
	public void setter() {
	}

	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterAndSetter() {
	}
}
