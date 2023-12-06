package exc_lab;

/**
 * InvalidOptionException which inherit Exception class
 */
public class InvalidOptionException extends Exception {

/**
 * Constructor of InvalidOptionException class
 * @param string print message of exception
 */
	public InvalidOptionException(String string) {
		super(string); 
		
	}

	
}