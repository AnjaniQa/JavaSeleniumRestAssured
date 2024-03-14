package Java.Concepts.Refelction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) {

        try {
            Class c = Class.forName("Java.Concepts.Refelction.Student");
            Method[] methods = c.getDeclaredMethods();
            for(Method m : methods) {
                System.out.println(m.getName());
            }
            System.out.println();
            Constructor[] constructors = c.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor.getName());
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
