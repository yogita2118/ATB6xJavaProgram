package may.ex_11052024;

public class Person {

    // Attributes
    String name;
    byte age;
    long phone_no;
    String[] address;
    double height;
    boolean isMale;
    float salary;
    String dob;
    String eye_color;

    // Behaviour / Functionality
    void walk()
    {
        System.out.println();
    }
    void talk(String msg){
        System.out.println("I will say -->" + msg);
    }
    String sleep(){
        return "sleeping";
    }
    String eat(String item){
        return item;
    }
}
