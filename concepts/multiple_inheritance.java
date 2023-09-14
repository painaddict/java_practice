import java.lang.String;


/* 
An interface can extend multiple interfaces.

A class can implement multiple interfaces.

However, a class can only extend a single class.
*/ 

interface int_1 {
	void method_1();
	void method_2();
}


interface int_2 {
	void method_3();
	void method_4();
}

// interface extension (can use multiple inheritance here)
interface int_extend extends int_1, int_2 {
	void method_3();
}

public class multiple_inheritance implements int_1, int_2 {
	public void method_1() {
		;
	}

	public void method_2() {
		;
	}

	public void method_3() {
		;
	}

	public void method_4() {
		;
	}

	public static void main(String[] args) {
		;
	}
}