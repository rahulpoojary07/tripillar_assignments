package Module_5;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
public class AgeValidation {

    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}