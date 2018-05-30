package basics;

public class IfElseConcept {

	public static void main(String[] args) {

		// & compares condition and all must be true in order to execute.
		// && The moment any of the conditions returns false, execution breaks
		// and moves to next condition.

		int a = 250;
		int b = 2000;
		int c = 20;

		if (a > b && a > c) {
			System.out.println("Value of A is " + a + " which is the greatest");
		} else if (b > a & b > c) {
			System.out.println("Value of B is " + b + " which is the greatest");
		} else {
			System.out.println("Value of C is " + c + " which is the greatest");
		}
	}
}
