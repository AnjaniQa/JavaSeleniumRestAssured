package Java.Coding.LargestNumberFromArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumberFromArray {

    public static void main(String[] args) {

        int[] a = {13,44,78,9,6};

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<a.length; i++) {
            int x = a[i];
            list.add(String.valueOf(x));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1o2 = o1 + o2;
                String o2o1 = o2 + o1;
                return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
            }
        });






    }

}
