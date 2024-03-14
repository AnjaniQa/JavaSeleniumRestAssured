package Java.Coding.String.ReverseString;

public class StringBuilderClass {

    public static void main(String[] args) {

        String s1 = "Test";
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);
    }
}
