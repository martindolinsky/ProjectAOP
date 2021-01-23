package sk.itsovy.dolinsky.pointcutorderaspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
public class LuvAopExpressions {

	@Pointcut("execution(* sk.itsovy.dolinsky.pointcutorderaspects.dao.*.*(..))")
	public void forDaoPackage() {
	}

	@Pointcut("execution(* sk.itsovy.dolinsky.pointcutorderaspects.dao.*.get*(..))")
	public void getter() {
	}

	@Pointcut("execution(* sk.itsovy.dolinsky.pointcutorderaspects.dao.*.set*(..))")
	public void setter() {
	}

	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {
	}
}
