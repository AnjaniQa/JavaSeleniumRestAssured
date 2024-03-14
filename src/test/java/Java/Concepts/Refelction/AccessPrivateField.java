package Java.Concepts.Refelction;

import java.lang.reflect.Field;

public class AccessPrivateField {

    public static void main(String[] args) {

        try {
            Student s = new Student(100, "Mohan");
            Field f = Student.class.getDeclaredField("id");
            f.setAccessible(true);
            int id = (int) f.get(s);
            System.out.println(id);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
