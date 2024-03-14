package Java.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        for(Map.Entry mp : map.entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }

        Set<Integer> keySet = map.keySet();


    }
}
