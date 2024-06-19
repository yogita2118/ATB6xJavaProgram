package june.ex_01062024;

public class Lab257 {
    public static void main(String[] args) {
        printf(3,4);
        printf("Yogi", "Solanki");
        printf(true,false);
        printf(3.12,4.23);

    }
    private  static <T> void printf(T i, T i1){
        System.out.println(i);
        System.out.println(i1);
    }
}
