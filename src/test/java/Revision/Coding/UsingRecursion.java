package Revision.Coding;

public class UsingRecursion {

    public String reverseString(String s) {

        if(s.length()<=0 || s==null) {
            return s;
        }
        while(s.length()>0) {
            return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
        }
        return null;
    }

    public static void main(String[] args) {

        UsingRecursion ur = new UsingRecursion();
        System.out.println(ur.reverseString("Anjani Kumar"));
    }
}
