package Revision.JavaConcepts.Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.add(3);
        Iterator itr = st.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
