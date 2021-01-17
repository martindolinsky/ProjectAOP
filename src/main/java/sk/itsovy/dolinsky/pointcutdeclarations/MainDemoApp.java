package sk.itsovy.dolinsky.pointcutdeclarations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.dolinsky.pointcutdeclarations.dao.AccountDAO;
import sk.itsovy.dolinsky.pointcutdeclarations.dao.MembershipDAO;

/**
 * @author Martin Dolinsky
 */
public class MainDemoApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		Account account = new Account();
		accountDAO.addAccount(account, true);
		accountDAO.doWork();

		membershipDAO.addSillyMember();
		membershipDAO.goToSleep();

		context.close();
	}
}
