package basics;

public class FunctionsInJava {
	
	// object is FunctionsInJava
	// "ab" is the reference variable 
	// After creating reference variable, all non-static methods can be called via the reference variable
	// It's compulsory to create an object in order to call Non-Static methods

	public static void main(String[] args) {
		FunctionsInJava ab = new FunctionsInJava();
		
		int l = ab.div(30, 10);
		System.out.println("div method returns:- "+l);
		
		String g = ab.letter();
		System.out.println("letter method returns:- "+g);
		
	}

	// void and return statements are contrary
	// return type: integer
	// input parameter: x and y
	// div method is a non-static method (deosn't have static keyword)
	public int div(int x, int y){
		int z = x/y;
		return z;
	}
	
	public String letter(){
		String t = "API";
		return t;
	}
}
