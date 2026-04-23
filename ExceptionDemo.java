public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            for(int i = 0; i <= 5; i++) {  
                arr[i] = i;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: Index out of bounds!");
        }
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Error: Cannot divide by zero!");
        }
    }
}