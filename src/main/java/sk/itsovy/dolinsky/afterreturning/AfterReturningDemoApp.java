package sk.itsovy.dolinsky.afterreturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.dolinsky.afterreturning.dao.AccountDAO;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public class AfterReturningDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> theAccounts = theAccountDAO.findAccounts();


		System.out.println("\n \n Main program for AfterReturningDemoApp");
		System.out.println("---------");
		System.out.println(theAccounts);
		System.out.println("\n");


		context.close();

	}

}
