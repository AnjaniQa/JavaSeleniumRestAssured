package Java.Coding.TypeConversion;

public class StringToInteger {

    public static void main(String[] args) {

        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i);

        Integer j = Integer.valueOf(s);
        System.out.println(j);
    }
}
