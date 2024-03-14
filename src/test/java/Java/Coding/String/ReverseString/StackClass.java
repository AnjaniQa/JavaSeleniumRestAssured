package Java.Coding.String.ReverseString;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        String s = "Test";
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            stack.push(s.charAt(i));
            i++;
        }

        String rs = "";

        while(!stack.empty()) {
            rs += stack.pop();
        }

        System.out.println(rs);
    }
}
