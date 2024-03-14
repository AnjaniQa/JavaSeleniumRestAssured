package Java.Concepts.CreateObjects.ObjectCloning;

public class Test {

    public static void main(String[] args) {
        try {
            Student s = new Student(1, "Aman");
            Student ss = (Student) s.clone();
            System.out.println(ss.id + " " + ss.name);
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
