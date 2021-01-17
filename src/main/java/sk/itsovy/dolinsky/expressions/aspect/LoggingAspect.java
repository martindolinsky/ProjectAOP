package sk.itsovy.dolinsky.expressions.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Aspect
@Component
public class LoggingAspect {


	//	@Before("execution(public void add*())")
	@Before("execution(* sk.itsovy.dolinsky.expressions.dao.*.*(..))")
	public void beforeAddAccountAdvice() {

		System.out.println("\n======>>> Executing @Before advice on method");
	}
}
