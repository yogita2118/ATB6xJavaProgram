package may.ex_25052024;

import java.io.FileInputStream;

public class Lab220 {
    public static void main(String[] args) {


        // Exception
        // Checked - JVM knows
        //FileInputStream f = new FileInputStream("C:/log.txt");

        try{

            FileInputStream f = new FileInputStream("C:/log.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Unchecked - JVM knows

        int a = 10;
        int c = a / 5;
        System.out.println(c);

        String s1 = null;
        s1.trim();

    }
}
