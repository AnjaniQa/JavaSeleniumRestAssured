package Revision.JavaConcepts.Reflection;

import java.lang.reflect.Field;

public class AccessPrivateVariables {

    public static void main(String[] args) throws Exception {

        Student s = new Student(10, "A");
        Class c = Class.forName("Revision.JavaConcepts.Reflection.Student");
        Field f = c.getDeclaredField("id");
        f.setAccessible(true);
        int id = (int) f.get(s);
        System.out.println(id);


    }
}
