package lab5;

import java.util.Stack;

/**
 * NumberSorter class 
 */
public class NumberSorter {

/**
 * insert value in stack and check the value which print in ascending if true
 * @param numbers values to pass
 * @param ascending true or false
 */
	public void sort(int[] numbers, boolean ascending) {
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		// The dest stack, to which the numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		// Add the initial array of numbers to the source stack.
		for (int number : numbers)
			srcStack.push(number);
		// bulk of code goes here (hint: use while loops rather than if’s)

//		from figure
		while (srcStack.size() > 0) {
			int next = srcStack.pop();
			while ((ascending && destStack.size() > 0 && destStack.peek() > next)
					|| (!ascending && destStack.size() < 0 && destStack.peek() < next)) {
				srcStack.push(destStack.pop());

			}

			destStack.push(next);

		}
		while (!destStack.isEmpty())
			System.out.print(destStack.pop() + ", ");

		System.out.println();
	}
}

