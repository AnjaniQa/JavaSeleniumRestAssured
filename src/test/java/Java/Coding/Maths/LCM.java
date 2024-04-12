package Java.Coding.Maths;

public class LCM {

    public int lcm(int n1, int n2) {

        if(n1>n2) {
            for(int i=1; i<=n2; i++) {
                int p = n1*i;
                if(p%n2==0) {
                    return p;
                }
            }
        }

        if(n1<n2) {
            for(int i=1; i<=n1; i++) {
                int p = n2*i;
                if(p%n1==0) {
                    return p;
                }
            }
        }

        return n1;


    }

    public static void main(String[] args) {

        LCM l = new LCM();
        System.out.println(l.lcm(12,24));
        System.out.println(l.lcm(1,24));
        System.out.println(l.lcm(12,16));

    }
}
