package may.ex_16052024.Hierachicalinheritance.ex1;

public class Vehicle {
    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from" + getClass().getSimpleName());
    }

}
