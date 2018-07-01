package basics;

public class VariablesInJava {
	
	/**
	 * In Java there are four types of variables:
	 * Non-static fields - A non-static field is a variable that belongs to an object.
	 * Static fields - A static field is a variable that belongs to a class.
	 * Local variables - A local variable is a variable declared inside a method.
	 * Parameters - A parameter is a variable that is passed to a method when the method is called.
	 */
	
	int firstValue; 


	public static void main(String[ ] args){

		int firstValue = 10;
		int secondValue = firstValue + 20;
		System.out.println("Addition of two number equals ===> "+ secondValue);
		
		
		for (int i = 1; i <= 10; i++){
			System.out.println("value of i is " + i);
		}
	
		for (int a = 10; a >= 1; a--){
			System.out.println("value of a is " + a);
		}
		
		VariablesInJava one = new VariablesInJava();
		one.forLoopConcept();

	}
		
		public void forLoopConcept(){
			int b;
			int c = 20;
		for (b = 0; b < 10; b++){
			System.out.println("Value of b: "+b);
			System.out.println("Value of c: "+c);
			c = c - 2;
		}
	}

}
