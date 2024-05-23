package may.ex_07052024;

public class Lab151 {
    public static void main(String[] args) {
        int r1 = sumofTwo(4, 5);
        System.out.println(r1);
        int r2 = sumofTwo(10, 11);
        String r3 = sumofTwo("Yogi", 11);
        System.out.println(r3);

    }

    static int sumofTwo(int a, int b) {
        return a + b;
    }

    static String sumofTwo(String a, int b) {
        return a + b;
    }
}
