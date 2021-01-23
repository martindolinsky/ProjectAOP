package sk.itsovy.dolinsky.pointcutorderaspects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Martin Dolinsky
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("sk.itsovy.dolinsky.pointcutorderaspects")
public class DemoConfig {

}
