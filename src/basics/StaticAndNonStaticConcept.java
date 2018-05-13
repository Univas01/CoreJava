package basics;

public class StaticAndNonStaticConcept {

	// Global variables have the scope to be accessed via all methods.
	// Create object reference in order to access non-static variables and methods.
	// Access static variables and methods directly without creating an object reference.

	String name = "Ola"; 									// non-static global variable
	static int age = 25;									// static global variable

	public static void main(String[] args) {


		// How to call static methods and variables
		// 1. Direct
		sum(); 												// method
		System.out.println(age);							// variable

		// 2. via className
		StaticAndNonStaticConcept.sum();					// method
		System.out.println(StaticAndNonStaticConcept.age);  // variable

		// How to call non-static methods and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// Question: Can I access static methods via object reference
		// Answer: YES but see warning message. Object reference does not need to be created in order to call static methods
		obj.sum();

	}
	public void sendMail(){
		System.out.println("Method Name is :- sendMail");	// non-static method
	}

	public static void sum(){								// static method
		System.out.println(age);
	}



}
