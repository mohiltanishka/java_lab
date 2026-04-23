import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);

        sc.close();
    }
    public static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
    public static void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
    public static void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Division: Cannot divide by zero");
        } else {
            System.out.println("Division: " + (a / b));
        }
    }
}
