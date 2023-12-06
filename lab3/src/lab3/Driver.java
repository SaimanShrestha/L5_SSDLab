package lab3;

import java.util.Random;

/**
 * This class is use as main class for testing the several method of Stats
 * class. It generate random values to store in array and in store the values
 * inside the array.
 * 
 * @author saiman
 */
public class Driver {
	/**
	 * main method creates a Stats object ,generate random values,and store the
	 * values inside the array.
	 * 
	 * @param args the command-line argunment
	 */
	public static void main(String[] args) {
		/**
		 * Constant
		 */
		final int VALUES = 10;
		/**
		 * object of Stats class assigning the array size 10
		 */
		Stats stats = new Stats(VALUES);
		/**
		 * Generate random value and add the value inside the array
		 */
		Random random = new Random();
		for (int index = 0; index < VALUES; index++) {
			stats.addValue(random.nextInt(100));
		}
		/**
		 * Print the array in String formated
		 */
		System.out.println("Numbers stored : ");
		System.out.println(stats);
		/**
		 * Print the various methods of Stats class.
		 */
		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMinNumber());
		System.out.println("Maximum value = " + stats.getMaxNumber());
	}
}