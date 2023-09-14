// https://docs.oracle.com/javase/tutorial/java/concepts/interface.html

import java.lang.String;

interface BaseOne {
	void check();

	int test = 0; // all interface data members are public, static, final
	
	// errors out
	// void method_with_body() {
	// 	System.out.println("I will not work!");
	// }
}

class DerivedClass implements BaseOne {
	public void check() { // all interface methods are PUBLIC
		System.out.println("Overriden check() function!");
	}
	DerivedClass() {
		//  error: cannot assign a value to final variable
		// test = 5;
		int test2 = 1;
	}
}

public class interfacing {
	public static void main(String[] args) {
		
		// error
		// BaseOne interface_object = new BaseOne();

		DerivedClass der_class = new DerivedClass();
		der_class.check();
	}
}


