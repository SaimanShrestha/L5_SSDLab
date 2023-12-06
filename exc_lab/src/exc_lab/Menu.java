package exc_lab;

/**
 * Menu class have method which display menu option selected and throw the exception
 * 
 * @author saiman
 */
public class Menu {

/**
 * display selected menu option and throw the exception if invalid
 * @param opt option selected
 * @throws InvalidOptionException display messgae
 */
	public void displayMenuOption(int opt) throws InvalidOptionException {
		if (opt < 4 && opt > 0) {
			System.out.println("Menu option " + opt + " selected");
		} else {
			throw new InvalidOptionException("error message");

		}

	}

}