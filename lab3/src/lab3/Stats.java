package lab3;

import java.util.Arrays;

/**
 * This class is associated to array for creating different methods for
 * calculating the array length,total values,average,maximum value, minimum
 * value etc
 * 
 * @author saiman
 */
public class Stats {
	/**
	 * An array variable to store data
	 */
	int[] numbers;
	/**
	 * To identify the index to store the data
	 */

	int count;

	/**
	 * To insert the value inside array
	 * 
	 * @param value to store data in the array
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * Calculate total length of an array and return it
	 * 
	 * @return total length
	 */
	public int getCount() {
		return numbers.length;
	}

	/**
	 * Calculate the maximum number in the array
	 * 
	 * @return maximum value
	 */
	public int getMaxNumber() {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];

			}
		}
		return max;
	}

	/**
	 * Calculate minimum value in the array and return it
	 * 
	 * @return minimum value
	 */
	public int getMinNumber() {
		int minValue = numbers[0];
		for (int index = 1; index < numbers.length; index++) {
			if (numbers[index] < minValue)
				minValue = numbers[index];
		}
		return minValue;
	}

	/**
	 * Find the total sum of value inside the array and return it.
	 * 
	 * @return total sum of value in the array
	 */

	public int getTotal() {
		int total = 0;
		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

	/**
	 * Calculate the average value of the array
	 * 
	 * @return average value of the array
	 */
	public double getAverage() {
		int total = 0;
		for (int index = 0; index < numbers.length; index++) {
			total += numbers[index];
		}
		double average = total / (double) numbers.length;
		return average;
	}

	/**
	 * Overriding the default toString method to array to string
	 */
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

	/**
	 * Constructor of Stats class to specified array size
	 * 
	 * @param capacity size of an array
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}
}