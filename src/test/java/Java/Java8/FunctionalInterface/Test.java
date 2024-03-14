package Java.Java8.FunctionalInterface;

abstract class Test implements FI {

    public static void main(String[] args) {

        FI t = () -> {
            System.out.println("Test");
        };
        t.run();
    }
}
