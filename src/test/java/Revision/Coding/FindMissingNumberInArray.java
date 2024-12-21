package Revision.Coding;

public class FindMissingNumberInArray {

    public int missingNumber(int a[], int n) {

        int actualSum = 0;
        int expectedSum = 0;

        for(int i=0; i<a.length; i++) {
            actualSum = actualSum + a[i];
        }

        expectedSum = n*(n+1)/2;

        return expectedSum-actualSum;

    }

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6};

        FindMissingNumberInArray f = new FindMissingNumberInArray();

        System.out.println(f.missingNumber(a,6));



    }
}
