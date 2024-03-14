package Java.Concepts.ComparableAndComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(1, "B"));
        studentList.add(new Student(20, "A"));
        studentList.add(new Student(12, "D"));
        studentList.add(new Student(30, "C"));

        System.out.println("Before sorting");

        for(Student student : studentList) {
            System.out.println(student.id + " " + student.name);
        }

        Collections.sort(studentList, new IdComparator());

        System.out.println("After sorting with respect to id");

        for(Student student : studentList) {
            System.out.println(student.id + " " + student.name);
        }

        Collections.sort(studentList, new NameComparator());

        System.out.println("After sorting with respect to name");

        for(Student student : studentList) {
            System.out.println(student.id + " " + student.name);
        }
    }
}
