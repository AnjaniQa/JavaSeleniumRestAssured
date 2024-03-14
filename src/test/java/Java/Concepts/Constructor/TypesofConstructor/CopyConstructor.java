package Java.Concepts.Constructor.TypesofConstructor;

public class CopyConstructor {

    public static void main(String[] args) {

        Student s = new Student(1, "Aman");
        Student cc = new Student(s);
        System.out.println(cc.id + " " + cc.name);
    }
}
