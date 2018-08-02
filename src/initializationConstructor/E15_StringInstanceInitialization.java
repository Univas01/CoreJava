package initializationConstructor;

public class E15_StringInstanceInitialization {

    /****************** Exercise 15 ****************
     * Create a class with a String that is
     * initialized using "instance initialization."
     ***********************************************/
    String s;

    public static void main(String[] args){

        E15_StringInstanceInitialization one = new E15_StringInstanceInitialization();
        one.s = "instance initialization";
        System.out.println("one.s = " + one.s);

    }
}
