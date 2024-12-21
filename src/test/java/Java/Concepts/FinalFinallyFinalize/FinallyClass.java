package Java.Concepts.FinalFinallyFinalize;

public class FinallyClass {

    public void test() {

        try {
            int n = 100/0;
            System.out.println(n);
        } catch(ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {

        FinallyClass f = new FinallyClass();
        f.test();

    }
}
