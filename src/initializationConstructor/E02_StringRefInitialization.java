package initializationConstructor;

public class E02_StringRefInitialization {

    /****************** Exercise 2 *****************
     * Create a class with a String field initialized
     * at the point of definition, and another one
     * initialized by the constructor. What is the
     * difference between the two approaches?
     ***********************************************/

    String s1;
    String s2 = "Initialized at definition";

    public E02_StringRefInitialization(String s){
       s1 = s;
    }

    public static void main(String[] args){

        E02_StringRefInitialization one = new E02_StringRefInitialization("Initialized at constructor");
        System.out.println(one.s1);
        System.out.println(one.s2);

        /****************** Difference between the two approaches *****************
         * The s2 field is initialized before the constructor is entered; technically, so is the
         * s1 field, which is set to null as the object is created. The more flexible s1 field
         * lets you choose what value to give it when you call the constructor, whereas s2
         * always has the same value.
         **************************************************************************/

    }
}
