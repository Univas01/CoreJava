package basics;

public class LoopConcept2 {

	static int x, y;
	
	public static void main(String[] args) {
		
		int b = 5;
		System.out.println(b += 10);
		
	/*	int i;
		for(i=0; i<10; i++){
			System.out.println("Value of i: "+i);
		}*/
		
		
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
