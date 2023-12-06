package lab6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * This class is associated with set has several method to store email, check
 * wheather the email is tore or not and displayemail method to print email
 * store in set.
 * 
 * @author saiman
 */
public class EmailStore {
	/**
	 * To store email addresses
	 */
	Set<String> emailAddresses = new HashSet<String>();

	/**
	 * add email to emailAddresses and check if email is already exist or not
	 * 
	 * @param email to add email and check it.
	 * @return return 'false' if email already exists and 'true' if added.
	 */
	public boolean addEmail(String email) {
		if (emailAddresses.contains(email)) {
			return false;
		} else {
			emailAddresses.add(email);
			return true;
		}

	}

	/**
	 * check email if it exists or not in attribute called emailAddresses
	 * @param email email to check
	 * @return return 'true' if exists and 'false' if not.
	 */
	public boolean hasEmail(String email) {
		if (emailAddresses.contains(email)) {
			return true;
		} else {
			System.out.println("Email is not stored");
			return false;
		}

	}
	
	/**
	 * Display the all email stored in attribute called emailAddresses 
	 */

	public void displayEmails() {
		System.out.println("\nThe emails are: ");
		for (String email : emailAddresses) {
			System.out.println(email);
		}

	}
}