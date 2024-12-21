package Java.Concepts.FinalFinallyFinalize;

public class FinalClass {

    final int m = 10;

    public void test() {
         //m = 20;
        System.out.println(m);

    }

    public static void main(String[] args) {

        FinalClass f = new FinalClass();
        f.test();

    }
}
