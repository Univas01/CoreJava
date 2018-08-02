package initializationConstructor;

public class E09_ThisConstructorCall {

    public E09_ThisConstructorCall(int a){

        this("Ola");
    }

    public E09_ThisConstructorCall(String b){
        System.out.println("Calling second constructor");
    }

    public static void main(String[] args){
        new E09_ThisConstructorCall(1);
    }
}
