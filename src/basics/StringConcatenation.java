package basics;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		String c = "value";
		String d = "name";
		
		System.out.println(a+b); 
		System.out.println(a+c); 
		System.out.println(c+a);
		System.out.println(a+b+c);
		System.out.println(c+a+b);
		System.out.println(c+d+a+b);
		System.out.println(c+d+(a+b));

	}
}
