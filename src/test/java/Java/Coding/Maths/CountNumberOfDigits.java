package Java.Coding.Maths;

public class CountNumberOfDigits {

    public int numberOfDigits(int n) {

        if(n/10 ==0) {
            return 1;
        }
        return 1 + numberOfDigits(n/10);
    }



    public static void main(String[] args) {

        int n = 123456;

        CountNumberOfDigits c = new CountNumberOfDigits();
        System.out.println(c.numberOfDigits(n));

    }
}
