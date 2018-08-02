package initializationConstructor;

public class E14_StaticStringInitialization {

    /****************** Exercise 14 *****************
     * Create a class with a static String field that
     * is initialized at the point of definition, and
     * another one initialized by the static
     * block. Add a static method that prints both
     * fields and demonstrates that they are both
     * initialized before they are used.
     ************************************************/


    static String s1 = "initialized at definition";
    static String s2;

    static {
        s2 = "initialized by Static block";
    }


    public static void main(String[] args){
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
