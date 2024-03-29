import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandeling {
    
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int myAge, yourAge; 
        System.out.println("Enter myAge: ");
        myAge = in.nextInt();
        System.out.println("Enter myAge: ");
        yourAge = in.nextInt();

        try {
            // Validating age
            validateAge(myAge);
            validateAge(yourAge);
        } catch (InvalidAgeException ex) {
            // Handling the custom exception
            System.out.println("Invalid age: " + ex.getMessage());
        }
    }
}
