import java.lang.String;

class Test {
	static int get_number() {
		return 69;
	}
}

public class static_function {
	public static void main(String[] args) {
		// call from Class directly
		System.out.println(Test.get_number());

		// call from Object
		System.out.println(new Test().get_number());
	}
}