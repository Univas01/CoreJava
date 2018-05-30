package basics;

public class EncapsulationInJava {
	
	/** Encapsulation is also called data hiding.
	 *  Encapsulation is part of Object Oriented Programming concept
	 *  There are 3 concepts in OOP - PIE (Polymorphism, Inheritance and Encapsulation) 
	 *  
	 *  How to implement Encapsulation
	 *  1. Provide global data private variable, so that those data can not be accessed from outside the class.
	 *  2. Generate Getters and Setters for those private variables.
	 *  3. Use Setter method to set values for those variables.
	 *  4. Use Getter method to access the variables.
	 */

	private String name;
	private int age;
	private int SSN;

	public static void main(String[] args) {

		EncapsulationInJava obj = new EncapsulationInJava();
		obj.setName("Ola Ajala");
		obj.setAge(10);
		obj.setSSN(234689678);

		System.out.println("Employee's name is " + obj.getName());
		System.out.println("Employee's Age is " + obj.getAge());
		System.out.println("Employee's SSN is " + obj.getSSN());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}
}
