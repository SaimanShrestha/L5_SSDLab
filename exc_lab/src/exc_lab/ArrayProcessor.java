package exc_lab;
/**
 * The ArrayProcessor class have method which gets length of an array and print it.
 */
public class ArrayProcessor {
/**
 * find array length and print it
 * @param array array to pass in parameter
 * @return length of array.
 */
    public int getArrayLength(Object[] array) {
        int count = 0;
        while (true) {
            try {
                Object t = array[count];
                count++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break; // exit the loop when an exception is thrown
            }
        }
        return count;
    }
}
