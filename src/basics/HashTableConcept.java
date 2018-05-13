package basics;

import java.util.Hashtable;

public class HashTableConcept {

	public void allDataTypes(){

		Hashtable d = new Hashtable();
		d.put("quoteId", 456);
		d.put("sendCurrency", "GBP");
		d.put("buyCurrency", "USD");
		d.put("Amount", 1000.05);
		d.put(2, "valueDate");

		System.out.println(d.size());
		System.out.println(d.get(2));
		System.out.println("sendCurrency: "+ d.get("sendCurrency"));

	}

	public void intergerDataType(){

		Hashtable<Integer, Integer> e = new Hashtable<Integer, Integer>();
		e.put(0, 500);
		e.put(1, 2000);
		e.put(2, 3000);
		e.put(3, 4500);
		e.put(4, 6000);
		e.put(5, 10000);
		
		System.out.println("Size of "+e.size());
		
		// Iterating
		for(int i=0; i<e.size(); i++){
			System.out.println(e.get(i));
		}
	}

	public static void main(String[] args) {

		HashTableConcept a = new HashTableConcept();
		a.allDataTypes();
		a.intergerDataType();

	}

}
