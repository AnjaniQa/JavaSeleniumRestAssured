package Java.Coding.TypeConversion;

public class IntegerToString {

    public static void main(String[] args) {

        int i = 100;

        String s = String.valueOf(i);
        System.out.println(s);

        String ss = Integer.toString(i);
        System.out.println(ss);
    }
}
