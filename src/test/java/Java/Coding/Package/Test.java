package Java.Coding.Package;

/*

Given a string s and an integer k.
Return the maximum number of vowel letters in any substring of s with length k.
Input: s = "abcioidef", k = 3. Output: 3
The substring "ioi" contains 3 vowel letters.
Input: s = “leriitcode", k = 4 Output: 3
“erii” contain 3 vowels.
 */

// a,e,i,o,u

public class Test {


    public int returnCount(String s, int n) {

        String ss ="";
        int max = 0;

        int i=0;
        while(i<s.length() && i+n<s.length()) {
            ss = s.substring(i, i+n);
            int numberOfVowels = 0;
            for(int j=0; j<ss.length(); j++) {

                char c = ss.charAt(j);

                if(c == 'a' || c == 'e' || c=='i' || c=='o' || c == 'u') {
                    numberOfVowels = numberOfVowels + 1;
                }
            }
            if(numberOfVowels > max) {
                max = numberOfVowels;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {

        Test t = new Test();
        String s1 = "abcioidef";
        String s2 = "leriitcode";
        String s3 = "leriiriiiitcode";
        System.out.println(t.returnCount(s1, 3));
        System.out.println(t.returnCount(s2, 4));
        System.out.println(t.returnCount(s3, 5));

    }
}
