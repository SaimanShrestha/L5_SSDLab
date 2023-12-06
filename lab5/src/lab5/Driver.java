package lab5;

/**
 * The Driver class creates an instances of NameManager class and test various method in NameManger
 * which add name to array ,display all the value inside array and remove long values.
 * 
 * @author saiman
 */
public class Driver {
/**
 * main class of 
 * @param args command-line arguments
 */
	public static void main(String[] args) {
//		instances of NameManager
		NameManager manager = new NameManager();
//		method of NameManager
		manager.addName("M.Mickleson");
		manager.addName("Johnua Taylor Biggs");
		manager.addName("P.Smith");
		manager.addName("Peter Jonathan Smythton");
		manager.addName("P.Thompson");
		// should print all names
		manager.printNames();
		
		// should print all names less than length 15
		manager.removeLongNames();
		System.out.println("\nAfter remove name of more than 15 words\n");
		manager.printNames();
		
//		Q2
//		NumberSorter instances
		NumberSorter sorter = new NumberSorter();
		sorter.sort(new int [] {1,9,2,3,10,8,12,1, 99, 2, 43, 68, 109, 0},true);
		sorter.sort(new int [] {1,2,3,4},true);
		sorter.sort(new int [] {4,3,2,1},true);
		

		
		

	}
	
	

}