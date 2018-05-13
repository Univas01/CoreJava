package inheritanceInJava;

public class CallClasses {

	public static void main(String[] args) {

		/* STATIC POLYMORPHISM - COMPILE-TIME POLYMORPHISM
		 Parent Class will only access its methods, other methods (Child methods) are not accessible.*/
		
		System.out.println("*****Vehicle Object*****");
		Vehicle big = new Vehicle();
		big.vehicleMethod(); // method is from Vehicle class
		big.vehicleTypes(); // method is from Vehicle class
		
		/* Child Class can access its methods(including overridden) and all Parents' methods. If this class however becomes a parent to
		 another child class, then those methods of new child are not accessible.*/
		
		System.out.println("*****Car Object*****");
		Car test = new Car();
		test.vehicleMethod(); // method is from Vehicle class (Inheritance Method)
		test.brake(); // method is from Car class
		
		/* Grand Child Class can access its methods (including overridden) and all Parents' and Grandparents' method. 
		 If this class however becomes a parent to another child class, then those methods of new child are not accessible.*/
		System.out.println("*****VW Object*****");
		VW run = new VW();
		run.vehicleTypes();
		run.vehicleMethod();
		run.mirror();
		run.passat();
		
		/*DYNAMIC POLYMORPHISM (TOP CASTING) - RUNTIME POLYMORPHISM 
		Only parent class methods and overridden methods will be called using Dynamic Polymorphism*/
		
		Car c = new VW();
		c.tyre();
		c.brake();
		c.mirror();
		c.vehicleTypes();
		c.vehicleMethod();
		
		Vehicle a = new Car();
		a.vehicleMethod();
		a.vehicleTypes();
		
		/*DYNAMIC POLYMORPHISM (DOWN CASTING)*/	
		Car ab = (Car) new Vehicle();
		ab.brake();
	}

}
