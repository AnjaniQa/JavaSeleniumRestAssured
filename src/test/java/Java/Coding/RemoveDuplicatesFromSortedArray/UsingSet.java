package Java.Coding.RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsingSet {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        Set<Integer> set = new HashSet();
        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);

        Iterator itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
