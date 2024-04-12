package Java.Coding.String;

public class LongestCommonPrefixClass {

    public String lcp(String[] s) {
        String prefix = s[0];
        for(int i=1; i<s.length; i++) {
            while(s[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) {
                    return "-1";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] s = {"abcd", "abcdefgh", "ab"};
        LongestCommonPrefixClass l = new LongestCommonPrefixClass();
        System.out.println(l.lcp(s));
    }
}
