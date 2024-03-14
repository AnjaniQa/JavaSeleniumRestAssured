package Java.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println(" ");

        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }

}
