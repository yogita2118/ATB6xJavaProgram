package may.ex_18052024;

public class Lab181 {
    public static void main(String[] args) {


        // super keyword in JAVA
        // parent ->
        //Super keyword reference to parent class
        //Variable of Parent.
        // Method of the parent.
        //Constructor of the parent.
        Car c = new Car();
        c.display();
    }
}
        class Car extends Vehicle {
            int maxSpeed = 180;

            void display() {
                System.out.println("Max speed of Vehicle can be -" + super.maxSpeed);
                System.out.println("Max speed of car can be -" + this.maxSpeed);
            }
        }

    class Vehicle{
        int maxSpeed = 100 ;// Instance variable  

        void message(){
            System.out.println("This is Vehicle Class");
        }
    }

