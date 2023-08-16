import java.lang.String;
import java.util.Scanner;

/*
Problem Statement:
	Design a class to perform polynomial addition where the two polynomials may
	contain arbitrary number of terms and may have an arbitrary degree.
*/

// TODO:  Add logic to handle unequal number of terms in the two polynomials
 

class Element {
	public int coefficient;
	public int power;

	Element() {
		coefficient = 0;
		power = 0;
	}
	Element(String elem) {
		String[] split_arr = elem.split("x", 0);
		
		coefficient = Integer.parseInt(split_arr[0]);
		power = Integer.parseInt(split_arr[1]); 
	}

	static Element add(Element elem_1, Element elem_2) {
		// assert elem.power == power; // error checking

		Element result = new Element();
		result.coefficient = elem_1.coefficient + elem_2.coefficient;
		result.power = elem_1.power;

		System.out.print(result.coefficient + "x" + result.power + " ");
		return result;
	}
}

class Polynomial {
	static void sum(String[] arr_1, String[] arr_2) {
		Element[] poly_1 = new Element[arr_1.length];
		Element[] poly_2 = new Element[arr_2.length];

		int result_size =  arr_1.length > arr_2.length ? arr_1.length : arr_2.length;
		// System.out.println("Result Size: " + result_size);

		Element[] result = new Element[result_size];

		// make element objects
		for (int i = 0; i < arr_1.length; i++) {
			poly_1[i] = new Element(arr_1[i]);
		}

		for (int i = 0; i < arr_2.length; i++) {
			poly_2[i] = new Element(arr_2[i]);
		}

		for (int i = 0; i < result_size; i++) {
			if (poly_1[i].power == poly_2[i].power) {
				result[i] = Element.add(poly_1[i], poly_2[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String P1 = "", P2 = "";
		
		System.out.print("Enter P1: ");
		P1 = scanner.nextLine();

		System.out.print("Enter P2: ");
		P2 = scanner.nextLine();

		String[] p1_split = P1.split(" ", 0); // '0' indicates that the string needs to be split until EOD
		String[] p2_split = P2.split(" ", 0);

		sum(p1_split, p2_split);
	}
}