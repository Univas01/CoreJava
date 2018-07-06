package operatorsConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ArithmeticCompoundConcept {

	public static void main(String[] args) {
		
		int a = 10;
		a = a + 5;
		System.out.println("Added 5 to value of A "+a);
		
		ArithmeticCompoundConcept one = new ArithmeticCompoundConcept();
		one.alternativeWay();
		one.arithmeticFunction();
	}

	public void alternativeWay(){
		
		// var = var op expression;
		int b = 20;
		b += 5; // add to existing value of b
		System.out.println("Added 5 to value of B: "+b);
	}
	
	public void arithmeticFunction(){
		int price1 = 50;
		int price2 = 100;
		int totalPrice = price1 + price2;
		int totalPricePlueFee = totalPrice+10;
		System.out.println(totalPricePlueFee);
		
	}
	
}
