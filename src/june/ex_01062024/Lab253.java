package june.ex_01062024;

import java.util.Map;
import java.util.WeakHashMap;

public class Lab253 {
    public static void main(String[] args) {
        Map<String,Integer>map = new WeakHashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",3);
        System.out.println(map);

    }
}
