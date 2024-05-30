package may.ex_25052024;

public class Lab219 {
    public static void main(String[] args) {
        String sh = args[0];
        int x = Integer.parseInt(sh); // (String)5 -> 5(int) // int x =5
        int a = 10 / x; // 10/5 ->2
        System.out.println(x);
        System.out.println(a);

        // TC1 - => 5 - Happy
        // No input
        // 0
        // -5
        // Pramod - java.lang.ArithmaticException

    }

}
