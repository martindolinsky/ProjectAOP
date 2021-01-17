package sk.itsovy.dolinsky.expressions.dao;

import org.springframework.stereotype.Component;
import sk.itsovy.dolinsky.expressions.Account;

/**
 * @author Martin Dolinsky
 */

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + ": ADDING AN ACCOUNT");
	}

	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;

	}


}
