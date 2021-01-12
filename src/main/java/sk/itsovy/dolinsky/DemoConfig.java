package sk.itsovy.dolinsky;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Martin Dolinsky
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("sk.itsovy.dolinsky")
public class DemoConfig {

}
