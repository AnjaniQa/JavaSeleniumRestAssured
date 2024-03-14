package Java.Coding.String.ReverseString;

public class ReverseString {


    public String reverse(String s) {
        if(s.length()==1 || s==null) {
            return s;
        }

        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));

    }


    public static void main(String[] args) {

        ReverseString r = new ReverseString();

        String s = "abcd gakk";

        System.out.println(r.reverse(s));
    }

}
