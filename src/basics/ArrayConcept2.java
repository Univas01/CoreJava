package basics;

public class ArrayConcept2 {

	public static void main(String[] args) {

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
