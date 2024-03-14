package Java.Concepts.Polymorphism.DynamicMethodDispatch;

public class Test {

    public static void main(String[] args) {

        A a;

        a = new B();
        a.get();

        a = new C();
        a.get();

    }
}
