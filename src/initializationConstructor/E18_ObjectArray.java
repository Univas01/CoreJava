package initializationConstructor;

public class E18_ObjectArray {

    /****************** Exercise 18 *****************
     * Create objects to attach to the array of
     * references for Exercise 17.
     ************************************************/

    public E18_ObjectArray(String s){

        System.out.println("String constructor: s = " + s);
    }

    public static void main(String[] args) {

        E18_ObjectArray[] array = new E18_ObjectArray[5];

        for(int i = 0; i < array.length; i++){
            array[i] = new E18_ObjectArray(Integer.toString(i));
        }

    }

}
