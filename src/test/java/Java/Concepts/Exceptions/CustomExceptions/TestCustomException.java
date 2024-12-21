package Java.Concepts.Exceptions.CustomExceptions;

public class TestCustomException {

    public static void main(String[] args) throws InvalidAgeException {

        int age=10;

        if(age<18) {
            throw new InvalidAgeException("Age is less than 18 years.");
        } else {
            System.out.println("Success");
        }
    }
}
