package sk.itsovy.dolinsky.pointcutorderaspects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.dolinsky.pointcutorderaspects.dao.AccountDAO;
import sk.itsovy.dolinsky.pointcutorderaspects.dao.MembershipDAO;

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

		accountDAO.setName("foobar");
		accountDAO.setServiceCode("silver");

		String name = accountDAO.getName();
		String code = accountDAO.getServiceCode();

		membershipDAO.addSillyMember();
		membershipDAO.goToSleep();

		context.close();
	}
}
