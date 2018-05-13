package basics;

public class ArrayConcept {

	public static void main(String[] args) {

		// STATIC ARRAY - When size of an array is fixed. e.g int[4] which means
		// size of an array is 4
		// Array: used to store similar data type values in an array variable
		// lower bound/index equals 0
		// upper bound/index equals n-1 (where n is size of an array)

		// Disadvantages
		// 1. Size is fixed - we use Collections (also called ArrayList or
		// HashTable or Dynamic Array) to overcome fixed size problem.
		// 2. Stores only similar data types - we use ObjectArray to overcome
		// this problem by storing different data types values.

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println("Value of first array is " + i[0]);
		System.out.println("Value of last array is " + i[3]);

		// print all values within an array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// Object Array (Object is a Super Class)
		Object ob[] = new Object[6];
		ob[0] = "Ola";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = 'M';
		ob[4] = "London";
		ob[5] = "18-04-1995";

		System.out.println("Array Size:- " + ob.length);
		System.out.println("Date of Birth:- " + ob[5]);

		for (int m = 0; m < ob.length; m++) {
			System.out.println(ob[m]);
		}
	}
}
