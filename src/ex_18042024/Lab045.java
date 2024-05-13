package ex_18042024;

public class Lab045 {
    public static void main(String[] args) {
        // post --> Value is first used for computing the result and then decrement.

        int a = 10;


        int b = a++ ;; // a = a+1
        System.out.println(b);
        System.out.println(a);
    }
}
