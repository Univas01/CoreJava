package basics;

public class LoopConcept {

	static int x, y;
	
	public static void main(String[] args) {
		
		LoopConcept loop = new LoopConcept();
		loop.increamentalAndDecreamentalForLoop();
		
		//1. while loop
		System.out.println("*****while loop*****");
		int i = 1;
		while (i<10){
			System.out.println(i);
			i = i + 1;
		}
		
		//2a for loop - incremental values
		System.out.println("*****for loop - incremental values*****");
		for(int j=1; j<=10; j++){
			System.out.println(j);
		}
		
		//2b for loop - decremental values
		System.out.println("*****for loop - decremental values*****");
		for(int k=10; k>=1; k--){
			System.out.println(k);
		}
		System.out.println("*****post increment******");
		int m = 1;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("*****post increment******");
		int y = 1;
		int z = ++y;
		System.out.println(y);
		System.out.println(z);
	}
	
	public void increamentalAndDecreamentalForLoop(){
		
		for(y=0; y<10; y++){
			System.out.println("Value of y " + y);
		}
		
		System.out.println("***********************");
		
		for(x=10; x>0; x--){
			System.out.println("Value of x " + x);
		}
	}
}
