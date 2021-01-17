package sk.itsovy.dolinsky.pointcutdeclarations.dao;

import org.springframework.stereotype.Component;
import sk.itsovy.dolinsky.pointcutdeclarations.Account;

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
