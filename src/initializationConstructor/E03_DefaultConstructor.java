package initializationConstructor;

public class E03_DefaultConstructor {

    /****************** Exercise 3 ******************
     * Create a class with a default constructor (one
     * that takes no arguments) that prints a
     * message. Create an object of this class.
     ************************************************/

    public E03_DefaultConstructor(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args){
        new E03_DefaultConstructor();

    }
}
