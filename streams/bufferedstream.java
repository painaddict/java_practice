import java.io.*;

public class bufferedstream {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		System.out.println(bis.markSupported());

	}
}