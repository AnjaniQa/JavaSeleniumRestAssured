package New;

/*

Ayush Mer 14:29
Given an array of integer [representing a number] , add 1 to it

e.g.

int arr[]=[1,2,3]


Output
124
 */

public class TestClass2 {

    public int getNumber(int[] a) {

        int finalNum = 0;
        for(int i=0; i<a.length; i++) {
            finalNum = finalNum * 10 + a[i];
        }
        finalNum ++;
        return finalNum;
    }


    public static void main(String[] args) {
        TestClass2 t = new TestClass2();
        int[] a = {9, 9, 9};
        System.out.println(t.getNumber(a));
    }
}
