package initializationConstructor;

public class E16_StringArray {

    /****************** Exercise 16 *****************
     * Assign a string to each element of an array of
     * String objects. Print the array using a for loop.
     ************************************************/

    public void stringObject(){

        String s1[] = new String[5];

        s1[0] = "A1";
        s1[1] = "A2";
        s1[2] = "A3";
        s1[3] = "A4";
        s1[4] = "A5";

        for(int i=0; i < s1.length; i++){
            System.out.println("s1[" + i + "] = " + s1[i]);

        }
    }

    public static void main(String[] args){

        E16_StringArray one = new E16_StringArray();
        one.stringObject();
    }
}
