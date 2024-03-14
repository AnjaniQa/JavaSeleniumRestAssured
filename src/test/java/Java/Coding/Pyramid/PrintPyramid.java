package Java.Coding.Pyramid;

public class PrintPyramid {


    void print1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void print2(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    void print3(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    void print4(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0; j<2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

    void print5(int n) {
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)+1;k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    void print6(int n) {
        for(int i=0; i<n; i++) {
            for(int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            for(int k=i;k<(2*i)+1;k++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {

        PrintPyramid p = new PrintPyramid();
        p.print1(5);
        System.out.println("");
        p.print2(5);
        System.out.println("");
        p.print3(5);
        System.out.println("");
        p.print4(5);
        System.out.println("");
        p.print5(5);
        System.out.println("");
        p.print6(5);
        System.out.println("");
    }
}
