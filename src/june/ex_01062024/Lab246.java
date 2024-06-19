package june.ex_01062024;

import java.util.HashSet;
import java.util.Set;

public class Lab246 {
    public static void main(String[] args) {
        Set courseSet = new HashSet();
        courseSet.add("ATB");
        courseSet.add("MTB");
        courseSet.add("LAPIT");
        courseSet.add("SDET Blueprint");
        courseSet.add("Java for Testers");
        System.out.println(courseSet);

        for (Object o : courseSet){
            System.out.println(o);
        }


    }
}
