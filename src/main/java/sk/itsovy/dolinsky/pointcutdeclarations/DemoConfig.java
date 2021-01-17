package sk.itsovy.dolinsky.pointcutdeclarations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Martin Dolinsky
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("sk.itsovy.dolinsky.pointcutdeclarations")
public class DemoConfig {

}
