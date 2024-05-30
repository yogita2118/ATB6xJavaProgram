package may.ex_30052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab239 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPTIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("JAVA for Tester");

        Iterator iterator = ttacourseList.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (iterator.hasNext()) {
                System.out.println(obj);
            } else {
                System.out.println("Not a String");
            }
        }
        //for (Object course : ttacourseList){
        //  System.out.println(course);
        //}
        //for (int i =0 ; i < ttacourseList.size() ; i ++){
        //  System.out.println(ttacourseList.get(i));
        // }

         ListIterator lt = ttacourseList.listIterator();
         while (lt.hasNext()){
            System.out.println(lt.next());
         }

        // ATB, MTB, PyATB, LAPIT, SDET Blueprint
        //ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
        //while (lt2.hasPrevious()) {

       //     System.out.println(lt2.hasPrevious());
        //}
    }
}

