package New;


/*

Given an array [a,b,c,f,r,a,b,c,d]
How many duplicates are present in the array and please result the output in below format
3
a:2
b:2
c:2
 */

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    public void getDuplicate(char[] a) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0; i<a.length; i++) {

            if(hashMap.containsKey(a[i])) {
                hashMap.put(a[i], hashMap.get(a[i]) + 1);
            } else {
                hashMap.put(a[i], 1);
            }
        }

        int count = 0;

        for(Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            if(map.getValue() > 1) {
                count ++;
            }
        }
        System.out.println(count);

        for(Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            if(map.getValue() > 1) {
                System.out.println(map.getKey() + ":" + map.getValue());
            }

        }

    }

    public static void main(String[] args) {


        char[] a = {'a','b','c','f','r','a','b','c','d'};


        TestClass t = new TestClass();

        t.getDuplicate(a);



    }

}
