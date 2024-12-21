package Java.Concepts.FinalFinallyFinalize;

public class Finalize {

    protected void finalize() {
        System.out.println("Finalize method called.");
    }

    public static void main(String[] args) {

        Finalize f = new Finalize();
        System.out.println(f.hashCode());
        f = null;
        System.gc();
    }
}
