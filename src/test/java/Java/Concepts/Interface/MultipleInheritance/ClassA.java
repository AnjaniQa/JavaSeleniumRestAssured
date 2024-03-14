package Java.Concepts.Interface.MultipleInheritance;

public class ClassA implements interface1, interface2{

    public void display() {
        System.out.println("Interface1");
    }

    public void print() {
        System.out.println("Interface2");
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.display();
        a.print();
    }
}
