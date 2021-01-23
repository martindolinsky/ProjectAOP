package sk.itsovy.dolinsky.pointcutorderaspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
public class MyCloudLogasyncAspect {

	@Before("forDaoPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n======>>> Logging to Cloud in async fashion");
	}
}
