package Java.Collections.List;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackAsList {

    public static void main(String[] args) {

        List<Integer> stack = new Stack<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);

        Iterator<Integer> itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
