package Revision.JavaConcepts.Reflection;

public class Student {

    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getId() {
        return this.id;
    }

    private String getName() {
        return this.name;
    }
}
