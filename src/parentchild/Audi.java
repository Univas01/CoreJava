package parentchild;

public class Audi extends Car {

	public static void main(String[] args) {
		
		Audi obj = new Audi();
		obj.brake();
		obj.mirror();
		obj.licensePlate();
	}
	
	public void tyres() {
		System.out.println("Audi.tyre");
	}

	public void mirror(){
		System.out.println("Audi.mirror");
	}
	
	public void gear() {
		System.out.println("Audi.gear");
	}
	
	public void licensePlate(){
		System.out.println("Audi.licensePlate");
	}
	
}
