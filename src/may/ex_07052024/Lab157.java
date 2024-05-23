package may.ex_07052024;

public class Lab157 {
    public static void main(String[] args) {
        f1();
        String[] names = {"Yogi","Solanki"};
        String[] names2 = new String[2];
        names2[0] = "Priya";
        names2[1] = "Ram";
        f1(names);
        // Parameter - any data type
        // Primitive - byte,short, long, float, int, boolean
        // Non-Primitive -String, Arrays

    }

    static void f1(String[] a){
        for(String name : a){
            System.out.println(name);
        }
    }

    static void f1() {
        f2();
        System.out.println("f1");
    }

    static  void f2(){
        System.out.println("f2");
    }
}
