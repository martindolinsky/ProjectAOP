package sk.itsovy.dolinsky;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.dolinsky.dao.AccountDAO;

/**
 * @author Martin Dolinsky
 */
public class MainDemoApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

		accountDAO.addAccount();

		context.close();
	}
}
