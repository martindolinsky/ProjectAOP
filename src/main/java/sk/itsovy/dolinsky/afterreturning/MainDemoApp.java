package sk.itsovy.dolinsky.afterreturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.dolinsky.afterreturning.dao.AccountDAO;
import sk.itsovy.dolinsky.afterreturning.dao.MembershipDAO;

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
		account.setName("Martin");
		account.setLevel("Gold");
		accountDAO.addAccount(account, true);
		accountDAO.doWork();

		accountDAO.setName("foobar");
		accountDAO.setServiceCode("silver");

		String name = accountDAO.getName();
		String code = accountDAO.getServiceCode();

		System.out.println("------------" + " Name: " + name + " Code:  " + code + "-----------------");

		membershipDAO.addSillyMember();
		membershipDAO.goToSleep();

		context.close();
	}
}
