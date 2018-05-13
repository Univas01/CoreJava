package inheritanceInJava;

public class Car extends Vehicle{

	public void tyre() {
		System.out.println("tyre--->parent");
	}
	
	public void brake() {
		System.out.println("brake--->parent");
	}
	
	public void mirror() {
		System.out.println("mirror--->parent");
	}
	
	public void vehicleMethod(){
		System.out.println("vehicleMethod--->parent");
	}
}
