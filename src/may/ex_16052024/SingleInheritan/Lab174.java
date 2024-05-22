package may.ex_16052024.SingleInheritan;

public class Lab174 {

    public static void main(String[] args) {


        // ## What is Inheritance?
        // Inherit Attributes and Behaviour from the parent.

        //Superclass / Parent Class/ Base Class
        //Subclass / Child Class / Derived Class

        // Parent -> Child

        // Child extends Parent{}
        // extend keyword -> Parents Attributes are available to the child(Class)

        // Single Inheritance
        // Prent -> Pro
        //Child -> Java

        // Java extends Programming
        Programming p = new Programming(12, "KO posan");
        Java j = new Java("Lambda exp");
        p.printInfo();
        j.printInfo();

        Programming p1 = new Programming(12, "Van Russom");
        p1.printInfo();

        Python python = new Python();
        python.printInfo();

    }
}
