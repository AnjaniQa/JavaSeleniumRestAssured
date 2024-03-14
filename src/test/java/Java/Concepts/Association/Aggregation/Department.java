package Java.Concepts.Association.Aggregation;

import java.util.List;

public class Department {

    String name;
    List<Student> student;

    public List<Student> getStudent() {
        return student;
    }

    public Department(String name, List<Student> student) {
        this.name = name;
        this.student = student;
    }
}
