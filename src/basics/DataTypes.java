package basics;

public class DataTypes {

	// Local variable - declared inside the method and only visible to the method.
	// Instance variable - declared inside the class but outside method or constructor body.
	// Static variable - 
	
	long longNumber; // Instance variable
	static double doubleNumber = 1234567000.99; // Static variable
	float floatNumber; // Instance variable
	char singleCharacter; // Instance variable
	boolean trueOrFalse; // Instance variable

	public void intPrimitiveDataType(){
		int number = 1234567890; // local variable
		System.out.println("int 	Primitive DataType ==> " + number);
	}

	public void longPrimitiveDataType(){
		longNumber = 123456789123456789L; // Instance variable
		System.out.println("long 	Primitive DataType ==> " + longNumber);
	}

	public void floatPrimitiveDataType(){
		floatNumber = 1234567890.123456789F;
		System.out.println("float 	Primitive DataType ==> " + floatNumber);

	}

	public void charPrimitiveDataType(){
		singleCharacter = 'a';
		System.out.println("char 	Primitive DataType ==> " + singleCharacter);

	}

	public void booleanPrimitiveDataType(){
		trueOrFalse = true;
		System.out.println("boolean Primitive DataType ==> " + trueOrFalse);

	}
	
	public static void main(String[] args) {
		DataTypes primitiveDataTypes = new DataTypes();
		
		primitiveDataTypes.intPrimitiveDataType();
		primitiveDataTypes.longPrimitiveDataType();
		System.out.println("double 	Primitive DataType ==> " + DataTypes.doubleNumber);
		primitiveDataTypes.floatPrimitiveDataType();
		primitiveDataTypes.charPrimitiveDataType();
		primitiveDataTypes.booleanPrimitiveDataType();
	}
}
