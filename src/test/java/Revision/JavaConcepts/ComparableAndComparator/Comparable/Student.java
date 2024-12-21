package Revision.JavaConcepts.ComparableAndComparator.Comparable;

public class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        if(id > s.id) {
            return 1;
        } else if(id<s.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
