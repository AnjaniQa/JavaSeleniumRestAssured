package Java.Coding.Recursion;

public class Print {

    public void print(int n) {

        int i=1;
        System.out.println(i);

        if(i>n) {
            return;
        }
        print(i++);

    }


    public void printReverse(int n) {

        if(n==0) {
            return;
        }
        System.out.println(n);
        printReverse(n-1);

    }

    public static void main(String[] args) {

        Print p = new Print();
        int n =10;
        p.print(n);
        p.printReverse(n);
    }

}
