package may.ex_16052024.Multilevelinheritance;

public class Lab176 {
    public static void main(String[] args) {

      //  Child c = new Child();
       // c.home();

        //Grandfather grandfather = new Grandfather();
        //grandfather.home();

        //Father father = new Father();
        //father.home();

        // Dynamic Dispatch
        //
        Grandfather grandfather = new Child();
        grandfather.home();
        Grandfather grandfather1 = new Grandfather();
        Grandfather grandfather2 = new Father();
        Grandfather grandfather3 = new Child();

        Father f1 = new Child();
        f1.home();

    }

}
