package Revision.Coding;

public class CountNumberOfConsecutiveCharacters {

    public String getString(String s) {

        if(s=="") {
            return s;
        }
        int n = s.length();
        String finalString = "";

        for(int i=0; i<n; i++) {
            int count = 1;
            while(i+1<n && s.charAt(i)==s.charAt(i+1)) {
                i++;
                count ++;
            }
            finalString = finalString + s.charAt(i) + count;
        }
        return finalString;
    }

    public static void main(String[] args) {

        String s = "ssbbbcccd";

        CountNumberOfConsecutiveCharacters c = new CountNumberOfConsecutiveCharacters();

        System.out.println(c.getString(s));
    }
}
