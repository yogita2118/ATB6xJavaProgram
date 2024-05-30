package may.ex_18052024;

public class Lab182 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.message();
        s1.display();
        System.out.println(s1.surname);
    }
}


class Student extends Person{
    String name = "Student";
    // is A relation - inheritance
    void messageStudent(){
        System.out.println("I am Student message");
    }

    void display(){
        //this.message();
        super.message();
    }


}

class Person{

    String name = "Father";
    String surname = "Solanki";
    void message(){
        System.out.println("I am person message");

    }

}
