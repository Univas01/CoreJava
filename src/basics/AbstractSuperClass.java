package basics;

public abstract class AbstractSuperClass {
	
	// Abstraction means hiding the implementation logic
	// Partial abstraction is possible - when Abstract class has both  abstract and non-abstract method
	// Object of Abstract class can not be instantiated(created)
	// Abstract method means there's is no method body.
	
	// Use abstract class to achieve partial abstraction business logic. However, use interface for full abstraction business logic.
	
	// Abstract methods
	public abstract void methodOneOfAbstractSuperClass(); 	

	public abstract void methodTwoOfAbstractSuperClass();
	
	// Non-abstract method
	public void methodThreeOfAbstractSuperClass() { 
		System.out.println("AbstractSuperClass");
	}
	
}
