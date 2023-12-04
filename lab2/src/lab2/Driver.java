package lab2;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		WordProcessor obj1 = new WordProcessor();
		System.out.println(obj1.countWord(sentence));
		System.out.println(obj1.countLetters(sentence));
		System.out.println(obj1.getLength(sentence));
		
//		 because WordProcessor implements the Counter interface.
//		This is an example of polymorphism, where an object of a class implementing an interface can be treated as an instance of that interface.

	}

}
