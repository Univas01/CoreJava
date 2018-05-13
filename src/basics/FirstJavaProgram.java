package basics;

public class FirstJavaProgram {

	public void firstMethod() {
		System.out.println("Hello! This is my first program");
	}

	public void secondMethod(){
		System.out.println("Hello! This is my second program");
	}

	public static void main(String[] args) {
		FirstJavaProgram firstProgram = new FirstJavaProgram();

		firstProgram.firstMethod();
		firstProgram.secondMethod();
	}
}
