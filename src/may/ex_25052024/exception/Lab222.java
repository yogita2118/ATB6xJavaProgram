package may.ex_25052024.exception;

public class Lab222 {
    public static void main(String[] args) {
        //String s1 = "Yogi";
        try{

            String s1 = "Yogi";
            String a1 = args[0];
            int a = 10/0;


        }catch (Exception  e){
            System.out.println("S1 is Null");
        }
        System.out.println("End of the program");

    }
}
