package Java.Coding.Package;

/*

In The City of Mumbai rain is pouring down heavily. But thanks to inspector Salve , now the city has the best rainwater harvesting system. The empty space between two building act as water storage. The height of the buildings differ, hence the container can hold amount of water which is equal to the height of a smaller building.

Input Format The First Line input takes the N number of buildings. In the following takes ins number of integers which depicts height of each building.
1 <= N <= 10^5
1
1 <= N <= 10^5
1 <= H <= 2x10^9

Output Format
Final output is the capacity that can be stored.
Sample Input:1
3
4 2 1
Sample Output: 3

Sample Input :2
6
1 1 5 4 3 2
Sample Output: 11
 */

public class Test2 {

    public int getWaterCount(int[] a, int n) {

        int i = 0;
        int sum = 0;
        while(i<=n-2) {
            if(a[i] == a[i+1]) {
                sum = sum + a[i];
            }
            else if(a[i] < a[i+1]) {
                sum = sum + a[i];
            }
            else {
                sum = sum + a[i+1];
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {

        int a[] = {4, 2, 1};
        int a2[] = {1,1,5,4,3,2};
        Test2 t = new Test2();
        System.out.println(t.getWaterCount(a, a.length));
        System.out.println(t.getWaterCount(a2, a2.length));

    }
}
