package Java.Concepts.Interface.Example;

public class ClassA implements TestInterface {

    public void display() {
        System.out.println("Interface");
    }

    public static void main(String[] args) {

        ClassA c = new ClassA();
        c.display();
    }

}
