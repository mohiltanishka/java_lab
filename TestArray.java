import java.util.Scanner;
class ArrayDemo {
    int arr[] = new int[5];
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void output1() {
        System.out.println("Array Elements:");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void output2() {
        System.out.println("Array using for-each:");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    void reverse() {
        System.out.println("Reverse Array:");
        for(int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class TestArray {
    public static void main(String[] args) {
        ArrayDemo a = new ArrayDemo();
        a.input();
        a.output1();
        a.output2();
        a.reverse();
    }
}