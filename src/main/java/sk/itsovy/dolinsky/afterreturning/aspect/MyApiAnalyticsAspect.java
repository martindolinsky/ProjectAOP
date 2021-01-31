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
@Order(3)
public class MyApiAnalyticsAspect {

	@Before("sk.itsovy.dolinsky.afterreturning.aspect.LuvAopExpressions.forDaoPackageNoGetterAndSetter()")
	public void performApiAnalytics() {
		System.out.println("\n =====>>> Performing Api Analytics");
	}

}
