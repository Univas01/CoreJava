package basics;

public class TwoDimArray {

	public static void main(String[] args) {

		// String Array for two dimensional array
		String x[][] = new String[3][5];

		// 1st row and 5 columns
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";

		// 2nd row and 5 columns
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";

		// 3rd row and 5 columns
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";

		System.out.println("Value of firstRow and thirdColumn is " + x[0][2]);
		System.out.println("Value of secondRow and fourthColumn is " + x[1][3]);
		System.out.println("Value of thirdRow and fifthColumn is " + x[2][4]);

		System.out.println("Number of rows is " + x.length);
		System.out.println("Number of columns is " + x[0].length);

		// row = 0, col = 0 to 4
		// row = 1, col = 0 to 4
		// row = 2, col = 0 to 4

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}

		// Object Array for two dimensional array
		Object i[][] = new Object[3][3];
		i[0][0] = "Name";
		i[0][1] = "Age";
		i[0][2] = "Location";

		i[1][0] = "Ola Ajala";
		i[1][1] = 25;
		i[1][2] = "London";

		i[2][0] = "Adeola Lawal";
		i[2][1] = 50;
		i[2][2] = "New York";

		for (int b = 0; b < i.length; b++) {
			for (int c = 0; c < i[0].length; c++) {
				System.out.println(i[b][c]);
			}
		}

		Object p[][] = new Object[3][3]; // 2 rows and 2 columns

		p[0][0] = "First Row and First Column";
		p[0][1] = "First Row and Second Column";
		p[0][2] = 1;

		p[1][0] = "Second Row and First Column";
		p[1][1] = "Second Row and Second Column";
		p[1][2] = 'M';

		p[2][0] = "Third Row and First Column";
		p[2][1] = "Third Row and Second Column";
		p[2][2] = 12.69887f;

		System.out.println(p.length); // total number of rows
		System.out.println(p[0].length); // total number of columns

		for (int s = 0; s < p.length; s++) {
			for (int t = 0; t < p[0].length; t++) {
				System.out.println(p[s][t]);
			}
		}
	}
}
