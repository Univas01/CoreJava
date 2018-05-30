package basics;

import java.util.ArrayList;

public class ArrayListConcept {


	public void allDataTypes(){

		ArrayList a = new ArrayList();
		a.add("12");
		a.add("Ola");
		a.add("12.98");
		a.add("O");
		a.add("45.85858585f");

		// Size of an ArrayList
		System.out.println("Size of an ArrayList:- "+ a.size());

		// Get value in a specific index within an ArrayList
		System.out.println("Second index has value of:- " + a.get(2));
		
		// remove an array
		a.remove("Ola");
		System.out.println("Size of an ArrayList after removing an array object:- "+ a.size());

		// Get all values within an ArrayList (Iterating through an Array List)
		for (int i = 0; i<a.size(); i++ ){
			System.out.println(a.get(i));
		}
	}
	
	public void intDataType(){
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(200);
		b.add(950);
		
		System.out.println("Size of an ArrayList:- "+ b.size());
		System.out.println("Second index has value of:- " + b.get(1));
		//System.out.println("Second index has value of:- " + b.get(2)); // IndexOutOfBoundsException Error
	}

	public void stringDataType(){
		ArrayList<String> c = new ArrayList<String>();
		c.add("VW");
		c.add("Audi");
		c.add("Benz");
		c.add("Toyata");
		c.add("Honda");
		
		System.out.println("Size of an ArrayList:- "+ c.size());
		System.out.println("Second index has value of:- " + c.get(1));
		for(int k = 0; k<c.size(); k++){
		System.out.println(c.get(k));
		
		}
		
	}

	public static void main(String[] args) {

		ArrayListConcept ab = new ArrayListConcept();
		//ab.allDataTypes();
		//ab.intDataType();
		ab.stringDataType();

	}

}
