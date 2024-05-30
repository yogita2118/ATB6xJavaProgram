package may.ex_30052024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab244 {
    public static void main(String[] args) {
        List<Integer>myMarks = new ArrayList<>();
        myMarks.add(89);
        myMarks.add(89);
        myMarks.add(89);
        //Collection.sort(myMarks);
        System.out.println(myMarks);

        Student student = new Student(1,"Pramod");
        Student student2 = new Student(5,"Dutta");
        Student student3 = new Student(3,"Astitva");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        Collections.sort(students,new SortByNameDesc());
        System.out.println(students);



    }
}
