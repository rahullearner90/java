class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}
class AgeValidator {
public static void validateAge(int age) throws InvalidAgeException {
if (age < 0 || age > 120) {
throw new InvalidAgeException("Invalid age. Age must be between 0 and 120.");
}
}
}
public class Main {
public static void main(String[] args) {
try{ AgeValidator.validateAge(25);
System.out.println("Age is valid.");
} catch (InvalidAgeException e) {
System.out.println("Error: " + e.getMessage());
}
try{ AgeValidator.validateAge(-5);
System.out.println("Age is valid.");
} catch (InvalidAgeException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
public class practical3 {
    
}
