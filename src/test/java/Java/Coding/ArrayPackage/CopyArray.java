package Java.Coding.ArrayPackage;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        // Shalow Copy

        int[] a = {1,2,3,4,5,6};
        int[] b = a.clone();

        for(int i=0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println("");

        // Deep copy

        int[] c = new int[a.length];
        System.arraycopy(a, 0, c, 0, a.length);

        for(int i=0; i<c.length; i++) {
            System.out.print(c[i] + " ");
        }

        System.out.println("");

        int[] d = Arrays.copyOf(a, a.length);

        for(int i=0; i<c.length; i++) {
            System.out.print(d[i] + " ");
        }


    }
}
