package Revision.JavaConcepts.ComparableAndComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    public static void main(String[] args) {

        List<Student> st = new ArrayList<Student>();
        st.add(new Student(1, "A"));
        st.add(new Student(10, "A"));
        st.add(new Student(5, "A"));
        st.add(new Student(90, "A"));

        for(Student s : st ) {
            System.out.println(s.id + " " + s.name);
        }

        Collections.sort(st);

        for(Student s : st ) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
