package parentchild;

public class Benz extends Audi {

	public static void main(String[] args) {
		
		Benz mob = new Benz();
		mob.camera();
		mob.mirror();
		mob.backsit();
		mob.licensePlate();
	}
	
	public void backsit(){
		System.out.println("Benz.backsit");
	}
	
	public void trafficator() {
		System.out.println("Benz.trafficator");
	}
	
	public void licensePlate(){
		System.out.println("Benz.licensePlate");
	}
}
