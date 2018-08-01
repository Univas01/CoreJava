package basics;

public class StringConcept {

	public static void main(String[] args){
		String one = "Learning JAVA slowly and steadily";
		if(one.startsWith("JAVA", 9)){
			System.out.println("CORRECT");
		} else {
			System.out.println("FALSE");
		}		
	}
}
