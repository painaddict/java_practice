import java.lang.String;

class BaseClass {
	public int number;
	public String name;

	void _print_object() {
		System.out.println("From BaseClass: " + number + " " + name);
	}
}

// use 'extends' keyword to inherit the class
class DerivedClass extends BaseClass {
	DerivedClass() {
		number = 1;
		name = "Default";
	}
}

// Only ONE public class should exist in a class file
public class inheritance {
	public static void main(String[] args) {
		// create an object
		BaseClass base = new BaseClass();
		base._print_object();

		DerivedClass derived = new DerivedClass();
		derived._print_object();
	}
}