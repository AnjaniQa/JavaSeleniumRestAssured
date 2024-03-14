package Java.Concepts.Static;

public class StaticVariable {

    static int count = 1;

    public static void main(String[] args) {

        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable();

        System.out.println(s1.count++);
        System.out.println(s2.count++);

        StaticVariable.count++;

    }


}
