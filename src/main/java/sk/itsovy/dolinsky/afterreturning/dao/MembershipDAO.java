package sk.itsovy.dolinsky.afterreturning.dao;

import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */

@Component
public class MembershipDAO {

	public boolean addSillyMember() {
		System.out.println(getClass() + ": ADDING A MEMBERSHIP ACCOUNT");
		return true;
	}

	public void goToSleep() {
		System.out.println(getClass() + ": GOING TO SLEEP");

	}
}
