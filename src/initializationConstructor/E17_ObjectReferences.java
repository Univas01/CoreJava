package initializationConstructor;

public class E17_ObjectReferences {

    /****************** Exercise 17 *****************
     * Create a class with a constructor that takes
     * a String argument. During construction, print
     * the argument. Create an array of object
     * references to this class, but don't
     * create objects to assign into the
     * array. When you run the program, notice
     * whether the initialization messages from the
     * constructor calls are printed.
     ************************************************/


    public E17_ObjectReferences(String s){

        System.out.println("String constructor: s = " + s);
    }

    public static void main(String[] args){

        E17_ObjectReferences one[] = new E17_ObjectReferences[5];

    }
}
