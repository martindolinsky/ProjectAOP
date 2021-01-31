package sk.itsovy.dolinsky.afterreturning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Martin Dolinsky
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("sk.itsovy.dolinsky.afterreturning")
public class DemoConfig {

}
