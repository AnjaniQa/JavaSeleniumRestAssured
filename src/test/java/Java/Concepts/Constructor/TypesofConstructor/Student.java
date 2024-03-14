package Java.Concepts.Constructor.TypesofConstructor;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
}
