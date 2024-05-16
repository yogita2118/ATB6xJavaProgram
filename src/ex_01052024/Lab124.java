package ex_01052024;

public class Lab124 {
    public static void main(String[] args) {
        int[] ages = {27,31,45,33,23};
        //Fixed elements

        int[] ages2 = new int[5];
        // Case 2 - Here by default value of all the elements will be?
        System.out.println(ages2[0]);
        System.out.println(ages2[1]);
        System.out.println(ages2[2]);
        System.out.println(ages2[3]);
        System.out.println(ages2[4]);

        ages2[0] = 11;
        System.out.println(ages2[0]);

        String[] breakfast_items = {"milk","idali","fruits","coffee","tea","poha"};
        System.out.println(breakfast_items.length);
    }
}
