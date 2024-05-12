package Java.Coding.RemoveDuplicatesFromSortedArray;

public class UsingNewArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int[] temp = new int[a.length];

        int i = 0;

        int j=0;

        for(i=0; i<a.length-1; i++) {
            if(a[i]!=a[i+1]) {
                temp[j] = a[i];
                j++;
            }
        }

        temp[j] = a[i];

        for(i=0; i<=j; i++) {
            a[i]=temp[i];
        }

        for(i=0; i<=j; i++) {
            System.out.println(a[i]);
        }
    }

}
