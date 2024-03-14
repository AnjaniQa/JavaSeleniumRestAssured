package Java.Concepts.ComparableAndComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(1, "A"));
        studentList.add(new Student(20, "B"));
        studentList.add(new Student(12, "C"));
        studentList.add(new Student(30, "D"));

        System.out.println("Before sorting");

        for(Student student : studentList) {
            System.out.println(student.id + " " + student.name);
        }



        Collections.sort(studentList);

        System.out.println("After sorting");

        for(Student student : studentList) {
            System.out.println(student.id + " " + student.name);
        }

    }
}
