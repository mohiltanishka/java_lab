import java.util.Scanner;
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
public class AgeTest {
    static void checkAge(int age) throws AgeException {
        if(age < 18 || age > 60) {
            throw new AgeException("Invalid Age! Age must be between 18 and 60.");
        } else {
            System.out.println("Valid Age ✔");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch(AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}