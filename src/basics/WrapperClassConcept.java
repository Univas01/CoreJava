package basics;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// Convert String to int
		String a = "200";
		System.out.println(a+20); // result is 20020 -- String Concatenation
		int b = Integer.parseInt(a);
		System.out.println(b+20); // As expected, result is 220 -- Addition
		
		// Convert String to double
		String c = "200.25";
		System.out.println(c+50); // result is 200.2550 -- String Concatenation
		double d = Double.parseDouble(c);
		System.out.println(d+50); // As expected, result is 250.25 -- Addition
		
		// Convert String to boolean
		String e = "true";
		boolean f = Boolean.parseBoolean(e);
		System.out.println(f);
		
		// Convert int to String
		int g = 545;
		System.out.println(g+100); // result is 645
		String h = String.valueOf(g);
		System.out.println(h+100); // As expected, result is 545100
		
		// Convert String to int (NumberFormatException exception error)
		String i = "100A";
		Integer.parseInt(i+30);
		
	}

}
