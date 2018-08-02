package Initialization;

public class MethodInit {

    int i = one(); // calling a method to provide initialization value
    int ab = three(i);

    public int one(){
        return 5;
    }

    public int three(int a){
        return a * 10;
    }

    public static void main(String[] args) {
        MethodInit two = new MethodInit();
        int p = two.i;
        int pp = two.ab;
        System.out.println(p);
        System.out.println(pp);
    }
}
