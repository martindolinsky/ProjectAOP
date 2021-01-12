package sk.itsovy.dolinsky.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
public class LoggingAspect {


	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice(){

		System.out.println("\n======>>> Executing @Before advice");
	}
}
