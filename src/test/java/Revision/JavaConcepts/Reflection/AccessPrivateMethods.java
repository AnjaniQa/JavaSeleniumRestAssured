package Revision.JavaConcepts.Reflection;

import java.lang.reflect.Method;

public class AccessPrivateMethods {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("Revision.JavaConcepts.Reflection.Student");
        Method methods[] = c.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method);
        }

       Student s = new Student(20, "Aman");

        Method method1 = c.getDeclaredMethod("getId");
        method1.setAccessible(true);
        int id = (int) method1.invoke(s);
        System.out.println(id);
    }
}
