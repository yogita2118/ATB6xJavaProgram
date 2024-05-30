package may.ex_18052024;

public class Lab185 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        // Constructor chaining -> Child DC -> Parent's DC
    }
}
class  Animal {
    public Animal (){
        System.out.println("Animal DC");
    }
}
class Dog extends Animal{
    String breed;
    Dog(){
        System.out.println("Dog DC");
    }
}