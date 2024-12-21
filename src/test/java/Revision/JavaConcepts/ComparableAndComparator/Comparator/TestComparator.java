package Revision.JavaConcepts.ComparableAndComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {

        List<Student> l = new ArrayList<Student>();
        l.add(new Student(20, "B"));
        l.add(new Student(91, "A"));
        l.add(new Student(90, "Z"));
        l.add(new Student(80, "C"));

        System.out.println("Sorting by id.");

        Collections.sort(l, new IdComparator());

        for(Student s : l) {
            System.out.println(s.id + " " + s.name);
        }

        System.out.println("Sorting by name.");

        Collections.sort(l, new NameComparator());

        for(Student s : l) {
            System.out.println(s.id + " " + s.name);
        }

    }
}
