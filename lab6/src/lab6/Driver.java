package lab6;

/**
 * This class is main class to test several method of EmailStore and return value to
 * check duplicate email and create an instances of EmailStore.
 */
public class Driver {
/**
 * main
 * @param args command-line argument
 */
	public static void main(String[] args) {
//		An instance of EmailStore
		EmailStore obj = new EmailStore();
		
//		To test addEmail method
		System.out.println(obj.addEmail("saimanshrestha@123gmail.com"));
		System.out.println(obj.addEmail("saimanshrestha@123gmail.com"));
		System.out.println(obj.addEmail("gheh@gmail.com"));
		System.out.println(obj.addEmail("moyemoye@13gmail.com"));
		System.out.println(obj.addEmail("daimod943678gmail.com"));
		
//		for hasEmail method 
		System.out.println("\nfor hasemail :");
		System.out.println(obj.hasEmail("saimanshrestha@123gmail.com"));
		System.out.println(obj.hasEmail("saimanshrestha@993gmail.com"));
		
		
//		for displayEmail method
		obj.displayEmails();
		
		
//		instance of WordCounter
		
		WordCounter w = new WordCounter();
//		test for WordCounter method
		w.addSentence("This is my wordld this is my world my");
		System.out.println("\noutput: ");
		w.outputResult();
		

	}

}