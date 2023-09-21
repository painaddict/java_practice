import java.io.*;
import java.lang.String;

public class fos {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.txt");

		fos.write(66); // ASCII
		System.out.println("Byte written to file.");

		System.out.println("Reading from the same file. ");
		FileInputStream fis = new FileInputStream("test.txt");
		System.out.println((char)fis.read());

		fos.write("Welcome!".getBytes());
		
		for (int i = 0; (i = fis.read()) != -1;) {
			System.out.print((char)i);
		}
		
		fis.close();
	}
}