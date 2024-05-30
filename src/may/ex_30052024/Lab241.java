package may.ex_30052024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab241 {
    public static void main(String[] args) {
        List stringList = null;
        stringList.add("ATB");

        List<Integer>myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(92);
        myMarks.add(93);
        Collections.sort(myMarks);
        System.out.println(myMarks);

    }
}
