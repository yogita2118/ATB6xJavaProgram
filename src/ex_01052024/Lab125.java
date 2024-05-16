package ex_01052024;

public class Lab125 {
    public static void main(String[] args) {
        final int[] a = new int[4];
        int[] b = new int[4];
        int[] c = new int[4];
         //defaults = a[0,0,0,0]
        // JVM = |0,0,0,0|
        a[3] =90;
        b[1]=10;
        c[2]=20;
        System.out.println(a[3]);
        System.out.println(b[1]);
        System.out.println(c[2]);
        b=c;
        System.out.println(a[3]);
        System.out.println(b[1]);
        System.out.println(c[2]);

    }
}
