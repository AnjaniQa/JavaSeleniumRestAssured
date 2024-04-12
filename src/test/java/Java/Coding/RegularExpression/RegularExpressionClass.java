package Java.Coding.RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionClass {

    public static void main(String[] args) {
        String m = "a";
        String regex = "[abcd]";
        System.out.println(Pattern.matches(regex, m));
        System.out.println(Pattern.matches("[a-zA_Z]", "z"));
    }

}
