package exc_lab;

/**
 * Driver class is used for creating instances of ArrayProcessor and Menu class to test various method of it
 * 
 * @author saiman
 */
public class Driver {
/**
 * main
 * @param args commmand-line arguments
 */
	public static void main(String[] args) {
		String[] animals = { "hem", "mohan", "sushan", "cont" };
		ArrayProcessor obj = new ArrayProcessor();
		int length = obj.getArrayLength(animals);
		System.out.println(length);

		Menu obj1 = new Menu();

		try {
			obj1.displayMenuOption(2);
			obj1.displayMenuOption(3);
			obj1.displayMenuOption(1);
			obj1.displayMenuOption(0);
			obj1.displayMenuOption(-1);

		} catch (InvalidOptionException e) {
			System.out.println("Error");
		}
		
		


	}

}