package initializationConstructor;

public class E01_StringRefInitialization {

    /****************** Exercise 01 ****************
     * Create a class with an uninitialized
     * String reference. Demonstrate that this
     * reference is initialized by Java to null.
     ***********************************************/

    String s;

    public static void main(String[] args){

        E01_StringRefInitialization one = new E01_StringRefInitialization();
        System.out.println("one.s : "+ one.s);
    }
}
