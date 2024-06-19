package june.ex_01062024;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab249 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1123345);
        integerSet.add(45121);
        integerSet.add(3145);
        integerSet.add(121);
        System.out.println(integerSet);

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(123345);
        integerSet2.add(11121);
        integerSet2.add(1345);
        integerSet2.add(121);
        integerSet2.add(null);
        System.out.println(integerSet2);

        Set integerSet3 = new TreeSet<>();
        integerSet3.add("Yogi");
        integerSet3.add("Solanki");
        System.out.println(integerSet3);




    }
}
