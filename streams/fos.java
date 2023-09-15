import java.io.*;

public class fos {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.txt");

		fos.write(66); // ASCII
		fos.close();
		System.out.println("Bytes written to file.");

		System.out.println("Reading from the same file. ");
		FileInputStream fis = new FileInputStream("test.txt");
		System.out.println(fis.read());

		fis.close();
	}
}