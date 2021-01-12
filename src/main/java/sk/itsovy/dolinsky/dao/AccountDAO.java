package sk.itsovy.dolinsky.dao;

import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */

@Component
public class AccountDAO {

	public void addAccount(){

		System.out.println(getClass() + ": ADDING AN ACCOUNT");
	}


}
