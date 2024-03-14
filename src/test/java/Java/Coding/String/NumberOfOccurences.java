package Java.Coding.String;

public class NumberOfOccurences {

    public static void main(String[] args) {
        String s = "aabbccddda";
        String ss ="";
        for (int i=0; i<s.length(); i++) {
            int count = 1;
            while (i+1<s.length() && s.charAt(i) == s.charAt(i+1)) {
                i++;
                count ++;
            }
            ss = ss + s.charAt(i) + count;
        }
        System.out.println(ss);
    }
}
