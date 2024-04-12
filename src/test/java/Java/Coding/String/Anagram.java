package Java.Coding.String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean checkAnagram(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(int i=0; i<s2.length(); i++) {
            char c = s2.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        for(Map.Entry<Character, Integer> mp : map.entrySet()) {
            if(mp.getValue() !=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "aabbccdd";
        String s2 = "bbccddaa";

        Anagram a = new Anagram();

        if(a.checkAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
