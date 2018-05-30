package parentchild;

public class Toyota extends Car {

	public static void main(String[] args) {
		
		Car check = new Toyota(); 
		/* Parent class reference variable referring child class object. 
		 * In this situation, the reference variable can access all parent's methods 
		 * but not that of child's methods. 
		 * This is sometimes referred as DYNAMIC POLYMORPHISM / RUN-TIME POLYMORPHISM / TOP CASTING
		 */
		
		check.camera();
		check.brake();
		check.licensePlate();

	}
	
	public void alloy(){
		System.out.println("Toyota.alloy");
	}
	
	public void camera(){
		System.out.println("Toyota.camera");
	}

}
