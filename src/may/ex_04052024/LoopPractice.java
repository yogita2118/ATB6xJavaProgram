package may.ex_04052024;

public class LoopPractice {
    public static void main(String[] args) {
        int n = 2;
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("_*");

            }
            System.out.println(" ");
        }
    }
}
