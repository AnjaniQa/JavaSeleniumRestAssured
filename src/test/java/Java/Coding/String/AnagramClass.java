package Java.Coding.String;

import java.util.HashMap;
import java.util.Map;

public class AnagramClass {

    public boolean isAnagram(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) +1);
            } else {
                map.put(c, 1);
            }
        }

        for(int j=0; j<s2.length(); j++) {
            char c = s2.charAt(j);
            if(map.containsKey(c)) {
               map.put(c, map.get(c)-1);
            } else {
                return false;
            }
        }

        for(Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue()!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AnagramClass a = new AnagramClass();
        System.out.println(a.isAnagram("abcd", "dcba"));
        System.out.println(a.isAnagram("abcd", "dcbae"));
    }
}
