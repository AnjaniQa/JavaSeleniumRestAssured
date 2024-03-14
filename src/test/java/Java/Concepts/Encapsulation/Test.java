package Java.Concepts.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Student s = new Student();
        s.setId(10);
        s.setName("Aman");
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
