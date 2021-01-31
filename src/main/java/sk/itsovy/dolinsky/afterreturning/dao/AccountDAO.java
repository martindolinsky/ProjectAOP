package sk.itsovy.dolinsky.afterreturning.dao;

import org.springframework.stereotype.Component;
import sk.itsovy.dolinsky.afterreturning.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Dolinsky
 */

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;

	public List<Account> findAccounts() {

		List<Account> myAccounts = new ArrayList<>();
		Account temp1 = new Account("John", "silver");
		Account temp2 = new Account("Josh", "gold");
		Account temp3 = new Account("Eva", "platinum");

		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);

		return myAccounts;
	}

	public void addAccount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + ": ADDING AN ACCOUNT");
	}

	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;

	}

	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}
}
