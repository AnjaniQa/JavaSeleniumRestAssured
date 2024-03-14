package Java.Coding.Maths;

public class Palindrome {

    public boolean ispalindrome(int n) {

        int n1 = n;
        int q=0;
        int reverseNumber=0;

        while(n!=0) {
            q = n%10;
            reverseNumber = reverseNumber*10 + q;
            n=n/10;
        }
        if(n1==reverseNumber) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {

        int n = 1234321;

        Palindrome p = new Palindrome();

        if(p.ispalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }



    }
}
