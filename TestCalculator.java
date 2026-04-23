import java.util.Scanner;
class Calculator {
    int a, b;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
    void add() {
        System.out.println("Addition: " + (a + b));
    }
    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }
    void mul() {
        System.out.println("Multiplication: " + (a * b));
    }
    void div() {
        if (b == 0) {
            System.out.println("Division: Cannot divide by zero");
        } else {
            System.out.println("Division: " + (a / b));
        }
    }
}
public class TestCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.input();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}