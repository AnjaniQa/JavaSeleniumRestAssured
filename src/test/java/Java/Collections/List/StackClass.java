package Java.Collections.List;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int i = 0;
        while (i < stack.size()) {
            System.out.println(stack.peek());
            i++;
        }
    }
}
