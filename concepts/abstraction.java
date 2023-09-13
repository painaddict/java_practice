// https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

import java.lang.String;

abstract class AbstractBase {
	// may or may not have abstract methods
	void _print_an_int() {
		System.out.println(9);
	}

	abstract void _print_a_char();
}

class DerivedClass extends AbstractBase {
	void _print_a_char() {
		System.out.println('A');
	}
}

public class abstraction {
	public static void main(String[] args) {
		// instantiating an object of abstract class (error)
		// AbstractBase abs_base = new AbstractBase();
		
		DerivedClass der_class = new DerivedClass();
		der_class._print_an_int();
		der_class._print_a_char();

		// try typecast
		AbstractBase type_cast_der = (AbstractBase) der_class;
	}
}