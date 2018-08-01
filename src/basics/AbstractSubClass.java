package basics;

public class AbstractSubClass extends AbstractSuperClass {

	public void methodOneOfAbstractSuperClass() {
		System.out.println("Implementation of methodOneOfAbstractSuperClass");

	}

	public void methodTwoOfAbstractSuperClass() {
		System.out.println("Implementation of methodTwoOfAbstractSuperClass");

	}

	public void methodThreeOfAbstractSuperClass() {

		System.out.println("Implementation of methodThreeOfAbstractSuperClass");

	}

	public void methodFourOfAbstractSubClass() {
		System.out.println("Implementation of methodFourOfAbstractSubClass");
	}

	public static void main(String[] args) {
		AbstractSubClass one = new AbstractSubClass();

		one.methodOneOfAbstractSuperClass();
		one.methodTwoOfAbstractSuperClass();
		one.methodThreeOfAbstractSuperClass();
		one.methodFourOfAbstractSubClass();
		
	}

	
}
