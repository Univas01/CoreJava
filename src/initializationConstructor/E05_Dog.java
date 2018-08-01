package initializationConstructor;

public class E05_Dog {

    /****************** Exercise 5 *****************
     * Create a class called Dog with an overloaded
     * bark() method. Your method should be
     * overloaded based on various primitive data
     * types, and should print different types of barking,
     * howling, etc., depending on which overloaded
     * version is called. Write a main() that calls
     * * all the different versions.
     ***********************************************/

    /****************** Exercise 6 ******************
     * Modify Exercise 5 so two of the overloaded
     * methods have two arguments of two different
     * types, but in reversed order relative to each
     * other. Verify that this works.
     ************************************************/

    char c = 'f';

    public void bark(){
        System.out.println("Default bark");
    }

    public void bark(byte b){
        System.out.println("int");
    }

    public void bark(short s){

    }

    public void bark(char c){
        this.c = c;
        System.out.println(c);

    }

    public void bark(int i, double d){
        System.out.println("int bark = howl");
    }

    public void bark(float f){

    }

    public void bark(double d, int i){
        System.out.println("Double");
    }

    public void bark(long l){

    }

    public void bark(boolean bo){

    }

    public static void main (String[] args){
        E05_Dog one = new E05_Dog();
        one.bark();
        one.bark(1, 2.2);
        one.bark(1.1, 2);
        one.bark(true);

    }




}
