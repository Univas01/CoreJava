package initializationConstructor;

public class E04_OverloadedConstructor {

    /****************** Exercise 4 *****************
     * Add an overloaded constructor to Exercise 3 that
     * takes a String argument and prints it along with
     * your message.
     ***********************************************/


    public E04_OverloadedConstructor(){
        System.out.println("Default constructor");
    }

    public E04_OverloadedConstructor(String a){
        System.out.println("String arg constructor");
        System.out.println(a);
    }

    public static void main (String[] args){
        new E04_OverloadedConstructor();
        new E04_OverloadedConstructor("Overloaded constructor");
    }

}
