package may.ex_01052024;

public class Lab127 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = arr1;


        System.out.println(arr1 == arr2);
        System.out.println(arr1 == arr3);
        System.out.println(arr1.equals(arr3)); // Objects.Java - ref.

        String s1 = "Yogi";
        String s2 = "Yogi";
        System.out.println(s1.equals(s2)); // Content - String.java - content



    }
}
