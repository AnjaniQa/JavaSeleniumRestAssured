package New;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);

        System.out.println("Enter any string");

        String s = ss.nextLine();

        //String s = "abcd";
        String s1 ="";

        for(int i=s.length()-1; i>=0; i--) {

            s1 = s1 + s.charAt(i);

        }
        System.out.println(s1);

        if(s.equals(s1)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not a palindrome");
        }
    }
}
