package Java.Concepts.Static.ThisAsMethodArgument;

public class ThisAsMethodArgumentClass {

    void m(ThisAsMethodArgumentClass o) {
        System.out.println(o.getClass());
    }

    void get() {
        m(this);
    }

    public static void main(String[] args) {

        ThisAsMethodArgumentClass thisAsMethodArgumentClass = new ThisAsMethodArgumentClass();
        thisAsMethodArgumentClass.get();
    }

}
