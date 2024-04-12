package Java.Coding.String;

public class LongestCommonPrefix {

    public String getLongestCommonPrefix(String[] s) {
        if(s.length==0) {
            return "";
        }
        String prefix = s[0];
        for(int i=1; i<s.length; i++) {
            while(s[i].indexOf(prefix)!=0) {
                int index = s[i].indexOf(prefix);
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) {
                    return "-1";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(l.getLongestCommonPrefix(input));
    }
}
