package Java.Concepts.Refelction;

import java.lang.reflect.Method;

public class AccessPrivateMethod {

    public static void main(String[] args) {

        try {
            Student s = new Student(1, "Aman");
            Method method = Student.class.getDeclaredMethod("getId");
            method.setAccessible(true);
            int id = (int) method.invoke(s);
            System.out.println(id);

            method = Student.class.getDeclaredMethod("getName");
            method.setAccessible(true);
            String name = (String) method.invoke(s);
            System.out.println(name);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
