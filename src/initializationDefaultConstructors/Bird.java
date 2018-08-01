package initializationDefaultConstructors;

public class Bird {

    public Bird(){

    }

    public Bird(int i){

    }

    public Bird(double d){

    }

    public static void main (String[] args){
        Bird b = new Bird();
        Bird b2 = new Bird(1);
        Bird b3 = new Bird(1.0);

    }
}
