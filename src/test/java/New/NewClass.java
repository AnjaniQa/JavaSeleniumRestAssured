package New;

import java.util.HashMap;
import java.util.Map;

public class NewClass {

    public void printCount(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> mp : map.entrySet()) {
            System.out.println(mp.getKey() + ":" + mp.getValue());
        }

    }

    public static void main(String[] args) {

        String abc = "abcdabcd";

        NewClass n = new NewClass();

        n.printCount(abc);

    }


}
