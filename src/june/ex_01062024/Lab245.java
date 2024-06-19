package june.ex_01062024;

import java.util.HashSet;
import java.util.Set;

public class Lab245 {
    public static void main(String[] args) {
        Set<String > fruits = new HashSet();
        // How Hashset Works?
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("apple");
        fruits.add("banana");
        //System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.remove("apple"));
        System.out.println(fruits);
    }

}
