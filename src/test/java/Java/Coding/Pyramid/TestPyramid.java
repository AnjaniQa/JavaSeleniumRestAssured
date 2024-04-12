package Java.Coding.Pyramid;

public class TestPyramid {

    public void triangleWithoutSpace(int n) {

        /*
               *
              ***
             *****
            *******
           *********

         */

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<(2*i)+1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void triangleWithSpace(int n) {
        /*
             *
            * *
           * * *
          * * * *
         * * * * *

         */

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public void standingPyramid(int n) {

    /*
                   *
                   * *
                   * * *
                   * * * *
                   * * * * *
                   * * * * * *
                   * * * * *
                   * * * *
                   * * *
                   * *
                   *

     */

        for(int i=0;i<n;i++) {

            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int i=n-1;i>0;i--) {

            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        int n = 5;

        TestPyramid t = new TestPyramid();

        t.triangleWithoutSpace(n);
        System.out.println("");
        t.triangleWithSpace(n);
        System.out.println("");
        t.standingPyramid(6);
        System.out.println("");
    }
}
