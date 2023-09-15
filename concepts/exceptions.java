// https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html
import java.lang.String;

public class exceptions {
	public static void main(String[] args) {
		//  The throw statement requires a single argument: a throwable object. 
		//  Throwable objects are instances of any subclass of the Throwable class.
		try {
			if (true) {
				throw new IndexOutOfBoundsException();
			}
		} catch (IndexOutOfBoundsException i) {
			System.err.println("Caught IndexOutOfBoundsException!");
		} finally {
			System.out.println("Finally block..");
		}
	}
}