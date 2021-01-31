package sk.itsovy.dolinsky.afterreturning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
@Order(1)
public class MyCloudLogasyncAspect {

	@Before("sk.itsovy.dolinsky.afterreturning.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n======>>> Logging to Cloud in async fashion");
	}
}
