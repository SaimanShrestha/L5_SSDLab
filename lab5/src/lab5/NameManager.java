package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * The NameManager class has several method which are used for adding name to
 * array,print name and remove any name which have length more than 15.
 */
public class NameManager {
	/**
	 * array to store names
	 */
	List<String> names = new ArrayList<String>();

	/**
	 * store name in names array
	 * 
	 * @param name to add name
	 */
	public void addName(String name) {
		names.add(name);
	}

	/**
	 * display the all the values inside names array.
	 */
	public void printNames() {
		String pName = null;
		for (int i = 0; i < names.size(); i++) {
			pName = names.get(i);
			System.out.println(pName);
		}
	}

	/**
	 * check all value inside names array and remove value having more than 15
	 * letter.
	 */
	public void removeLongNames() {
		String pName = null;
		for (int i = 0; i < names.size(); i++) {
			pName = names.get(i);
			if (pName.length() > 15) {
				names.remove(i);
			}
		}

	}

}