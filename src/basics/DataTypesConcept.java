package basics;

public class DataTypesConcept {

	public static void main(String[ ] args){
		
		// Data types are grouped into two; Primitive and Object Data Types
		// Once value is set for Object data type, it can't be changed. Meaning Object Data types are immutable.
		
		Integer one = new Integer(45); // Integer object data type. 
		int two = one; // int primitive data type ( Converting Integer Object data type into int primitive data type) - Auto Boxing
		System.out.println("Value is: "+ two);
		
		int three = 5; // int primitive data type
		Integer four = three; // ( Converting int primitive data type into  Integer Object data type) - Auto Boxing
		System.out.println("Value is: "+ four);
		
		int five = 10;
		System.out.println(five += 90);
		
	}
}
