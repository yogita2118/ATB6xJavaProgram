package may.ex_25052024.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab226 {
    public static void main(String[] args) {
        try {
            int a = 10 / 10;
            //FileReader f = new FileReader(new File("c://a.txt"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}