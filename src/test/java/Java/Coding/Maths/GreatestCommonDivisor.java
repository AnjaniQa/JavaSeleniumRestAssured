package Java.Coding.Maths;

public class GreatestCommonDivisor {

    public int gcd(int n1, int n2) {
        if(n1==0) {
            return n2;
        }
        if(n2==0) {
            return n1;
        }
        if(n1==n2) {
            return n1;
        }
        if(n1>n2) {
            if(n1%n2 == 0) {
                return n1;
            }
            return gcd(n1%n2, n2);
        }

        if(n2%n1 == 0) {
            return n1;
        }
        return gcd(n1, n2%n1);

    }

    public static void main(String[] args) {

        GreatestCommonDivisor g = new GreatestCommonDivisor();

        int n1  = 12;
        int n2 = 16;
        System.out.println(g.gcd(n1, n2));
    }
}
