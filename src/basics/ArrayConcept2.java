package basics;

public class ArrayConcept2 {

	public static void main(String[] args) {

<<<<<<< HEAD
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
=======
		int[] intArray = new int[5];
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		ArrayConcept2 two = new ArrayConcept2();
		//two.multiDimensionalArray();
		two.multiDimensionalArray2();
	}

	public void multiDimensionalArray() {

		int[][] intArrayy = new int[3][3];
		intArrayy[0][0] = 10;
		intArrayy[0][1] = 15;
		intArrayy[0][2] = 20;

		intArrayy[1][0] = 30;
		intArrayy[1][1] = 35;
		intArrayy[1][2] = 40;

		intArrayy[2][0] = 50;
		intArrayy[2][1] = 55;
		intArrayy[2][2] = 60;

		System.out.println("Length of Row: " + intArrayy.length);
		System.out.println("Length of Column: " + intArrayy[0].length);

		for (int j = 0; j < intArrayy.length; j++) {
			for (int k = 0; k < intArrayy[0].length; k++) {
				System.out.println(intArrayy[j][k]);
			}

		}

	}
	
	public void multiDimensionalArray2(){
		String[][] y = new String[3][3];
		y[0][0] = "FirstRow and FirstColumn";
		y[0][1] = "FirstRow and SecondColumm";
		y[0][2] = "FirstRow and Thirdolumm";
		
		y[1][0] = "SecondRow and FirstColumn";
		y[1][1] = "SecondRow and SecondColumm";
		y[1][2] = "SecondRow and Thirdolumm";
		
		y[2][0] = "ThirdRow and FirstColumn";
		y[2][1] = "ThirdRow and SecondColumm";
		y[2][2] = "ThirdRow and ThirdColumm";
		
		System.out.println(y[2][1]);
		
		for(int d = 0; d < y.length; d++){
			for(int e = 0; e < y[d].length; e++){
				System.out.println("d: " + d + ", e: "+ e);
			}
		}
			
	}
	public void stringArrayTest(){
		
		double[][] doubleTest = new double[3][5];
		
>>>>>>> 7daea81d2557e0e8675b274d730d92ed2bd3a1b9
	}
}
