package initializationOverloading;


public class Flower {

    int petalCount = 0;
    String s = "initial value";

    public Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = "+petalCount);
    }

    public Flower(String ss){
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    public Flower(String s, int petals){
        this(petals);
       // this("ss"); can't call two constructors
        this.s = s;
        System.out.println("String & int args");
    }

    public Flower(){
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    public void printPetalCount(){
       // this(11); // Constructor can't be called from inside a method using this keyword
        // this("Ola"); // Constructor can't be called from inside a method using this keyword

        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args){
        Flower x = new Flower();
        new Flower(35);
        new Flower("Ola");
        x.printPetalCount();
    }
}
