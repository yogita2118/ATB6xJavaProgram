package april.ex_25042024;

public class Lab087 {
    public static void main(String[] args) {
        int itemCode = 001;
        // JDK > 13

        switch (itemCode){
            case 001 -> System.out.println("It's a laptop!");
            case 002 ->System.out.println("It's a Desktop");
            case 003,004 -> System.out.println("It's a Phone");
            default -> System.out.println("Hello");
        }

        char ch = 'a';
        switch (ch) {
            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");

        }
    }
}
