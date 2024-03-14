package Java.Coding.Maths;

public class Factorial {

    public int fact(int n) {

        if(n==1) {
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        int n= 5;

        System.out.println(f.fact(n));

    }
}
