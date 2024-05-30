package may.ex_30052024;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {

    public static void main(String[] args) {


        // List - ArrayList, LinkedList, Vector
        // Set - HashSet, LinkedHasSet, TreeSet
        // Map - Hashmap, LinkedHashMap, TreeMap
        // Queue - PriorityQueue, LinkedList
        // Hashtable, Properties

        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("SDET Blueprint");

        List numList = new ArrayList();
        numList.add(111);
        numList.add(100);
        numList.add(150);
        numList.add(240);

        courseList.addAll(numList);
        System.out.println(courseList);




    }
}
