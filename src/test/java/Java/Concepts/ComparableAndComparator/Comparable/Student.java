package Java.Concepts.ComparableAndComparator.Comparable;

public class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if (id == o.id) {
            return 0;
        } else if (id < o.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
