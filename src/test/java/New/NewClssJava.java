package New;

public class NewClssJava {

    public void getNumber(int[] a, int n) {

        int sum =0;
        int min = 0;
        int diff =0;

        for(int i=0; i<a.length-1; i++) {
            for(int j=i+1; j<a.length; j++) {
                sum = sum + a[i] + a[j];
                diff = n - sum;
                //if(diff <

            }
        }




    }



    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        NewClssJava n = new NewClssJava();

        n.getNumber(a, 10);


    }
}
