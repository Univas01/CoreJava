package initializationConstructor;

public class E08_ThisMethodCall {

    /****************** Exercise 8 *****************
     * Create a class with two methods. Within the
     * first method call the second method twice to
     * see it work, the first time without using this,
     * and the second time using this.
     * (You should not use this form in practice.)
     ***********************************************/

    public void firstMethod(){
        secondMethod();
        this.secondMethod();
    }

    public void secondMethod(){
        System.out.println("secondMethod() called");
    }

    public static void main(String[] args) {
        E08_ThisMethodCall one = new E08_ThisMethodCall();
        one.firstMethod();
    }
}


