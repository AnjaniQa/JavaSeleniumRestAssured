package Java.Coding.Maths;

public class GCD {

    public int gcd(int n1, int n2) {

        if(n1==0) {
            return n2;
        }

        if(n2==0) {
            return n1;
        }

        if(n1>n2) {
            if(n1%n2==0) {
                return n2;
            }
            return gcd((n1%n2), n2);
        }
        if(n1<n2) {
            if(n2%n1==0) {
                return n1;
            }

        }
        return gcd(n1, (n2%n1));
    }

    public static void main(String[] args) {

        GCD g = new GCD();

        System.out.println(g.gcd(2,4));
        System.out.println(g.gcd(12,16));
        System.out.println(g.gcd(10,20));
        System.out.println(g.gcd(100,150));

    }
}
