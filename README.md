[program-1 for calculator ](#code1)
[program-2 for TestCalculator ](#code2))
[program-3 for HelloWorld ](#code3)
[program-4 for Armstrong ](#code4)
[program-5 for Distance1 ](#code5)
[program-6 for Distance2 ](#code6)
[program-7 for Factorial ](#code7)
[program-8 for Fibonacci ](#code8)
[program-9 for Main ](#code9)
[program-10 for Palindrome ](#code10)
[program-11 for Pattern ](#code11)
[program-12 for ReverseArray ](#code12)
[program-13 for Time1 ](#code13)
[program-14 for Time2 ](#code14)
[program-15 for SingleInheritanceDemo ](#code15)
[program-16 for MultilevelInheritanceDemo ](#code16)
[program-17 for HierarchicalInheritanceDemo ](#code17)
[program-18 for CharFileCopy ](#code18)
[program-19 for ByteFileCopy ](#code19)
[program-20 for CombinedProgram ](#code20)
[program-21 for JoinExample ](#code21)
[program-22 for AddSwing ](#code22)
[program-23 for RegisterForm ](#code23)
[program-24 for CalculatorSwing ](#code24)
[program-25 for MatrixAddition ](#code25)
[program-26 for ShapeFrame ](#code26)
[program-27 for PaintBrush ](#code27)
[program-28 for TestPackage ](#code28)
[program-29 for TestPackage ](#code29)
[program-30 for ExceptionDemo ](#code30)
[program-31 for AgeTest ](#code31)
[program-32 for AllInOneDemo ](#code32)
[program-33 for TestArray ](#code33)
## assci-1

```
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
```
<img width="460" height="171" alt="image" src="https://github.com/user-attachments/assets/325a9760-76f6-4275-bd1e-f13b3712e510" />

## assci-2
```
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
```
<img width="130" height="76" alt="image" src="https://github.com/user-attachments/assets/a0303385-45da-4330-b26c-4395a757f9e8" />

## assci-3

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
<img width="138" height="38" alt="image" src="https://github.com/user-attachments/assets/36572a87-731d-4a6e-b18e-9ab856a6f314" />


## assci-4
```
class Armstrong {
   Armstrong() {
   }

   void check(int var1) {
      int var3 = 0;

      int var4;
      for(var4 = var1; var1 > 0; var1 /= 10) {
         int var2 = var1 % 10;
         var3 += var2 * var2 * var2;
      }

      if (var3 == var4) {
         System.out.println("Armstrong");
      } else {
         System.out.println("Not Armstrong");
      }

   }

   public static void main(String[] var0) {
      Armstrong var1 = new Armstrong();
      var1.check(153);
   }
}
```
<img width="114" height="28" alt="Screenshot 2026-03-12 222509" src="https://github.com/user-attachments/assets/8bbb59fc-5c65-41f9-a639-ee9f5c2a2792" />

## assci-5
```
class Distance1 {
    int km, m, cm;

    void input(int km, int m, int cm) {
        this.km = km;
        this.m = m;
        this.cm = cm;
    }

    void add(Distance1 d1, Distance1 d2) {
        cm = d1.cm + d2.cm;
        m = d1.m + d2.m + cm / 100;
        cm = cm % 100;
        km = d1.km + d2.km + m / 1000;
        m = m % 1000;
    }

    void display() {
        System.out.println(km + " km " + m + " m " + cm + " cm");
    }

    public static void main(String[] args) {
        Distance1 d1 = new Distance1();
        Distance1 d2 = new Distance1();
        Distance1 result = new Distance1();

        d1.input(2, 500, 50);
        d2.input(1, 800, 70);

        result.add(d1, d2);
        result.display();
    }
}
```
<img width="187" height="21" alt="Screenshot 2026-03-12 223136" src="https://github.com/user-attachments/assets/46a06249-74b6-4b58-902c-7b7cfd1c9897" />

## assci-6
```
class Distance2 {
    int m, cm;
    void input(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }
    void add(Distance2 d1, Distance2 d2) {
        cm = d1.cm + d2.cm;
        m = d1.m + d2.m + cm / 100;
        cm = cm % 100;
    }
    void display() {
        System.out.println(m + " meter " + cm + " cm");
    }
    public static void main(String args[]) {
        Distance2 d1 = new Distance2();
        Distance2 d2 = new Distance2();
        Distance2 result = new Distance2();
        d1.input(5, 80);
        d2.input(3, 40);
        result.add(d1, d2);
        result.display();
    }
}
```
<img width="164" height="26" alt="image" src="https://github.com/user-attachments/assets/8e302576-fba7-45d5-a372-e72b2facd3fa" />

## assci-7
```
class Factorial {
    void fact(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("Factorial = " + f);
    }

    public static void main(String args[]) {
        Factorial obj = new Factorial();
        obj.fact(5);
    }
}
```
<img width="179" height="23" alt="Screenshot 2026-03-12 223710" src="https://github.com/user-attachments/assets/8ed3b4d5-4fdb-466c-8a8f-46a77e3f6d63" />

## assci-8
```
class Fibonacci {

    void series(int n) {
        int a = 0, b = 1;

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String args[]) {
        Fibonacci obj = new Fibonacci();
        obj.series(10);
    }
}
```
<img width="262" height="17" alt="Screenshot 2026-03-12 225430" src="https://github.com/user-attachments/assets/3e00c7ee-2827-4e2f-9fd3-98b93fa2c2c3" />

## assci-9
[
```
class Matrix {
    int a[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int b[][] = {
        {1,1,1},
        {1,1,1},
        {1,1,1}
    };

    int c[][] = new int[3][3];

    void sum() {
        System.out.println("Sum of matrices:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiply() {
        System.out.println("Multiplication of matrices:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = 0;
                for(int k=0;k<3;k++)
                    c[i][j] += a[i][k] * b[k][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

    void rowSum() {
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++)
                sum += a[i][j];
            System.out.println("Row " + i + " sum = " + sum);
        }
    }

    void columnSum() {
        for(int j=0;j<3;j++){
            int sum=0;
            for(int i=0;i<3;i++)
                sum += a[i][j];
            System.out.println("Column " + j + " sum = " + sum);
        }
    }

    void diagonalSum() {
        int sum=0;
        for(int i=0;i<3;i++)
            sum += a[i][i];
        System.out.println("Diagonal sum = " + sum);
    }
}

public class Main {
    public static void main(String args[]) {

        Matrix obj = new Matrix();   // object creation

        obj.sum();
        obj.multiply();
        obj.transpose();
        obj.rowSum();
        obj.columnSum();
        obj.diagonalSum();
    }
}
```
<img width="314" height="494" alt="image" src="https://github.com/user-attachments/assets/d92a6697-bf11-44d2-b69b-2eb284999eac" />

## assci-10
```
class Palindrome {

    void check(int n) {
        int rev = 0, r, temp = n;

        while(n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String args[]) {
        Palindrome obj = new Palindrome();
        obj.check(121);
    }
}
```
<img width="126" height="27" alt="Screenshot 2026-03-12 230028" src="https://github.com/user-attachments/assets/cf2f438c-df8b-434c-9251-eb6c7c2a4124" />

## asssci-11
```
class Pattern {

    void printPattern() {

        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern obj = new Pattern();
        obj.printPattern();
    }
}
```
<img width="120" height="126" alt="Screenshot 2026-03-12 230649" src="https://github.com/user-attachments/assets/c26865c0-486f-42cc-833e-d16f52423f8a" />

## assci-12
```
class ReverseArray {
    void reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int a[] = {10, 20, 30, 40, 50};
        obj.reverse(a);
    }
}
```
<img width="166" height="24" alt="Screenshot 2026-03-12 231132" src="https://github.com/user-attachments/assets/3848e00c-3ab4-4a1c-86f9-8e4faf9b9032" />

## assci-13
```
class Time1 {
    int hr, min, sec;

    void input(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void add(Time1 t1, Time1 t2) {
        sec = t1.sec + t2.sec;
        min = t1.min + t2.min + sec / 60;
        sec = sec % 60;
        hr = t1.hr + t2.hr + min / 60;
        min = min % 60;
    }

    void display() {
        System.out.println(hr + " hr " + min + " min " + sec + " sec");
    }

    public static void main(String[] args) {
        Time1 t1 = new Time1();
        Time1 t2 = new Time1();
        Time1 result = new Time1();

        t1.input(2, 45, 50);
        t2.input(1, 30, 30);

        result.add(t1, t2);
        result.display();
    }
}
```
<img width="220" height="21" alt="Screenshot 2026-03-12 231640" src="https://github.com/user-attachments/assets/04ed1b1f-9e34-4fc4-b07a-75cf8db89e32" />

## assci-14
```
class Time2 {
    int hr, min;

    void input(int hr, int min) {
        this.hr = hr;
        this.min = min;
    }

    void add(Time2 t1, Time2 t2) {
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr + min / 60;
        min = min % 60;
    }

    void display() {
        System.out.println(hr + " hour " + min + " minutes");
    }

    public static void main(String args[]) {

        Time2 t1 = new Time2();
        Time2 t2 = new Time2();
        Time2 result = new Time2();

        t1.input(2, 45);
        t2.input(3, 30);

        result.add(t1, t2);
        result.display();
    }
}
```
<img width="199" height="21" alt="Screenshot 2026-03-12 232235" src="https://github.com/user-attachments/assets/a5465b3c-a719-4518-a0c2-ea3b0eb0cec1" />

## assci-15
```
class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog1 obj = new Dog1();
        obj.eat();
        obj.bark();
    }
}
```
<img width="199" height="44" alt="Screenshot 2026-03-12 233147" src="https://github.com/user-attachments/assets/d0b9156c-94db-4b51-952a-76904d177d93" />

## assci-16
```
class Animal2 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy2 extends Dog2 {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy2 obj = new Puppy2();
        obj.eat();
        obj.bark();
        obj.weep();
    }
}
```
<img width="193" height="83" alt="Screenshot 2026-03-12 233611" src="https://github.com/user-attachments/assets/5421b7e0-4c73-4ed6-bb50-ab04e50ab0ca" />

## assci-17
```
class Animal3 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        Cat3 c = new Cat3();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
```
<img width="136" height="105" alt="Screenshot 2026-03-12 233911" src="https://github.com/user-attachments/assets/8237048e-e645-4f68-bd53-e76c6e939231" />

## assci-18
```
import java.io.*;
public class CharFileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("dest_char.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();
            System.out.println("File copied using character stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="193" height="12" alt="image" src="https://github.com/user-attachments/assets/5527a848-4fe8-433e-96c8-0810663c527b" />

## assci-19
```
import java.io.*;

public class ByteFileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("dest_byte.txt");

            int b;

            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("File copied using byte stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
<img width="167" height="13" alt="image" src="https://github.com/user-attachments/assets/f7442230-8f2d-4e77-a6b5-fc64be7f143f" />

## assci-20
```
class A extends Thread implements Runnable {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    void print() {
        for(int i=1; i<=100; i++) {
            System.out.println("A (No Thread): " + i);
        }
    }
}
class B extends Thread implements Runnable {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    void print() {
        for(int i=1; i<=100; i++) {
            System.out.println("B (No Thread): " + i);
        }
    }
}
class C extends Thread implements Runnable {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    void print() {
        for(int i=1; i<=100; i++) {
            System.out.println("C (No Thread): " + i);
        }
    }
}
public class CombinedProgram {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println("---- Without Thread ----");
        a.print();
        b.print();
        c.print();
        System.out.println("---- Using Thread ----");
        a.setName("Thread-A");
        b.setName("Thread-B");
        c.setName("Thread-C");
        a.start();
        b.start();
        c.start();
        try {
            a.join();
            b.join();
            c.join();
        } catch(Exception e) {}
        System.out.println("---- Using Runnable ----");

        Thread t1 = new Thread(new A(), "Runnable-A");
        Thread t2 = new Thread(new B(), "Runnable-B");
        Thread t3 = new Thread(new C(), "Runnable-C");

        t1.start();
        t2.start();
        t3.start();
    }
}
```
<img width="139" height="401" alt="image" src="https://github.com/user-attachments/assets/a0df1c20-fa98-4c39-baa7-d4bdbe4924f3" />

## assci-21
```
class A extends Thread {
    public void run() {
        for(int i=1;i<=5;i++)
            System.out.println("A: " + i);
    }
}
class B extends Thread {
    public void run() {
        for(int i=1;i<=5;i++)
            System.out.println("B: " + i);
    }
}
class C extends Thread {
    public void run() {
        for(int i=1;i<=5;i++)
            System.out.println("C: " + i);
    }
}
public class JoinExample {
    public static void main(String[] args) throws Exception {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        t1.start();
        t1.join();  
        t2.start();
        t2.join();   
        t3.start();
    }
}
```
<img width="39" height="194" alt="image" src="https://github.com/user-attachments/assets/6c5f2fe2-a6cb-4180-ba5d-a550be26faa7" />

## assci-22
```
import javax.swing.*;
import java.awt.event.*;
public class AddSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition");
        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JLabel l3 = new JLabel("Result:");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton b = new JButton("Add");
        l1.setBounds(50,30,120,30);
        t1.setBounds(180,30,120,30);
        l2.setBounds(50,80,120,30);
        t2.setBounds(180,80,120,30);
        l3.setBounds(50,130,120,30);
        t3.setBounds(180,130,120,30);
        b.setBounds(120,180,100,30);
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(String.valueOf(c));
            }
        });
        f.setSize(350,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="242" height="211" alt="image" src="https://github.com/user-attachments/assets/737be681-57c5-4e72-b1ff-21c05656523b" />

## assci-23
```
import javax.swing.*;
import java.awt.event.*;
public class RegisterForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");
        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Email:");
        JLabel l3 = new JLabel("Password:");
        JLabel l4 = new JLabel("Gender:");
        JLabel l5 = new JLabel("DOB:");
        JLabel l6 = new JLabel("Phone:");
        JLabel l7 = new JLabel("Address:");
        JLabel l8 = new JLabel("Course:");
        JLabel l9 = new JLabel("Hobbies:");
        JLabel l10 = new JLabel("Country:");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JPasswordField t3 = new JPasswordField();
        JTextField t5 = new JTextField();
        JTextField t6 = new JTextField();
        JTextField t7 = new JTextField();
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        String courses[] = {"B.Tech","BCA","MCA","MBA"};
        JComboBox c1 = new JComboBox(courses);
        JCheckBox h1 = new JCheckBox("Reading");
        JCheckBox h2 = new JCheckBox("Music");
        JCheckBox h3 = new JCheckBox("Sports");
        String country[] = {"India","USA","UK","Canada"};
        JComboBox c2 = new JComboBox(country);
        JButton b = new JButton("Submit");
        l1.setBounds(50,30,100,30);   t1.setBounds(150,30,150,30);
        l2.setBounds(50,70,100,30);   t2.setBounds(150,70,150,30);
        l3.setBounds(50,110,100,30);  t3.setBounds(150,110,150,30);
        l4.setBounds(50,150,100,30);  r1.setBounds(150,150,70,30); r2.setBounds(220,150,80,30);
        l5.setBounds(50,190,100,30);  t5.setBounds(150,190,150,30);
        l6.setBounds(50,230,100,30);  t6.setBounds(150,230,150,30);
        l7.setBounds(50,270,100,30);  t7.setBounds(150,270,150,30);
        l8.setBounds(50,310,100,30);  c1.setBounds(150,310,150,30);
        l9.setBounds(50,350,100,30);  h1.setBounds(150,350,80,30); h2.setBounds(230,350,80,30); h3.setBounds(310,350,80,30);
        l10.setBounds(50,390,100,30); c2.setBounds(150,390,150,30);
        b.setBounds(150,440,100,30);
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(r1); f.add(r2);
        f.add(l5); f.add(t5);
        f.add(l6); f.add(t6);
        f.add(l7); f.add(t7);
        f.add(l8); f.add(c1);
        f.add(l9); f.add(h1); f.add(h2); f.add(h3);
        f.add(l10); f.add(c2);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Registration Successful");
            }
        });
        f.setSize(450,550);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="317" height="400" alt="image" src="https://github.com/user-attachments/assets/e07ca2aa-ebb4-4e25-9be6-40af4c6b314c" />

## assci-24
```
import javax.swing.*;
public class CalculatorSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField t = new JTextField();
        t.setBounds(30,30,240,30);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("+");
        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("-");
        JButton b9 = new JButton("7");
        JButton b10 = new JButton("8");
        JButton b11 = new JButton("9");
        JButton b12 = new JButton("*");
        JButton b13 = new JButton("0");
        JButton b14 = new JButton("C");
        JButton b15 = new JButton("=");
        JButton b16 = new JButton("/");
        b1.setBounds(30,80,50,40);
        b2.setBounds(90,80,50,40);
        b3.setBounds(150,80,50,40);
        b4.setBounds(210,80,50,40);
        b5.setBounds(30,130,50,40);
        b6.setBounds(90,130,50,40);
        b7.setBounds(150,130,50,40);
        b8.setBounds(210,130,50,40);
        b9.setBounds(30,180,50,40);
        b10.setBounds(90,180,50,40);
        b11.setBounds(150,180,50,40);
        b12.setBounds(210,180,50,40);
        b13.setBounds(30,230,50,40);
        b14.setBounds(90,230,50,40);
        b15.setBounds(150,230,50,40);
        b16.setBounds(210,230,50,40);
        f.add(t);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4);
        f.add(b5); f.add(b6); f.add(b7); f.add(b8);
        f.add(b9); f.add(b10); f.add(b11); f.add(b12);
        f.add(b13); f.add(b14); f.add(b15); f.add(b16);
        final int[] num1 = new int[1];
        final int[] num2 = new int[1];
        final char[] op = new char[1];
        b1.addActionListener(e -> t.setText(t.getText() + "1"));
        b2.addActionListener(e -> t.setText(t.getText() + "2"));
        b3.addActionListener(e -> t.setText(t.getText() + "3"));
        b5.addActionListener(e -> t.setText(t.getText() + "4"));
        b6.addActionListener(e -> t.setText(t.getText() + "5"));
        b7.addActionListener(e -> t.setText(t.getText() + "6"));
        b9.addActionListener(e -> t.setText(t.getText() + "7"));
        b10.addActionListener(e -> t.setText(t.getText() + "8"));
        b11.addActionListener(e -> t.setText(t.getText() + "9"));
        b13.addActionListener(e -> t.setText(t.getText() + "0"));
        b4.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '+'; t.setText(""); });
        b8.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '-'; t.setText(""); });
        b12.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '*'; t.setText(""); });
        b16.addActionListener(e -> { num1[0] = Integer.parseInt(t.getText()); op[0] = '/'; t.setText(""); });
        b15.addActionListener(e -> {
            num2[0] = Integer.parseInt(t.getText());
            int result = 0;
            switch(op[0]) {
                case '+': result = num1[0] + num2[0]; break;
                case '-': result = num1[0] - num2[0]; break;
                case '*': result = num1[0] * num2[0]; break;
                case '/': result = num1[0] / num2[0]; break;
            }
            t.setText(String.valueOf(result));
        });
        b14.addActionListener(e -> t.setText(""));
        f.setSize(320,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="219" height="246" alt="image" src="https://github.com/user-attachments/assets/67ce69e3-b31b-4747-a60a-557b73dddad9" />

##  assci-25
```
import javax.swing.*;
import java.awt.event.*;
public class MatrixAddition {
    public static void main(String[] args) {
        JFrame f = new JFrame("Matrix Addition");
        JTextField a11 = new JTextField();
        JTextField a12 = new JTextField();
        JTextField a21 = new JTextField();
        JTextField a22 = new JTextField();
        JTextField b11 = new JTextField();
        JTextField b12 = new JTextField();
        JTextField b21 = new JTextField();
        JTextField b22 = new JTextField();
        JTextField c11 = new JTextField();
        JTextField c12 = new JTextField();
        JTextField c21 = new JTextField();
        JTextField c22 = new JTextField();
        JLabel plus = new JLabel("+");
        JLabel equal = new JLabel("=");
        JButton btn = new JButton("Add");
        a11.setBounds(50,50,40,30);
        a12.setBounds(100,50,40,30);
        a21.setBounds(50,90,40,30);
        a22.setBounds(100,90,40,30);
        plus.setBounds(150,70,20,30);
        b11.setBounds(180,50,40,30);
        b12.setBounds(230,50,40,30);
        b21.setBounds(180,90,40,30);
        b22.setBounds(230,90,40,30);
        equal.setBounds(280,70,20,30);
        c11.setBounds(310,50,40,30);
        c12.setBounds(360,50,40,30);
        c21.setBounds(310,90,40,30);
        c22.setBounds(360,90,40,30);
        btn.setBounds(200,150,80,30);
        f.add(a11); f.add(a12); f.add(a21); f.add(a22);
        f.add(b11); f.add(b12); f.add(b21); f.add(b22);
        f.add(c11); f.add(c12); f.add(c21); f.add(c22);
        f.add(plus); f.add(equal);
        f.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int A11 = Integer.parseInt(a11.getText());
                int A12 = Integer.parseInt(a12.getText());
                int A21 = Integer.parseInt(a21.getText());
                int A22 = Integer.parseInt(a22.getText());
                int B11 = Integer.parseInt(b11.getText());
                int B12 = Integer.parseInt(b12.getText());
                int B21 = Integer.parseInt(b21.getText());
                int B22 = Integer.parseInt(b22.getText());
                c11.setText(String.valueOf(A11 + B11));
                c12.setText(String.valueOf(A12 + B12));
                c21.setText(String.valueOf(A21 + B21));
                c22.setText(String.valueOf(A22 + B22));
            }
        });
        f.setSize(450,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
<img width="314" height="197" alt="image" src="https://github.com/user-attachments/assets/f18c39d7-4dd8-469f-850d-25e526dc1b94" />

## assci-26
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ShapeFrame extends JFrame implements ActionListener {
    String shape = "";
    public ShapeFrame() {
        setTitle("Shape Drawer");
        String names[] = {"Circle","Oval","Rectangle","Square","Line",
                          "Arc","RoundRect","3DRect","FillOval","FillRect"};
        for(int i=0;i<10;i++) {
            JButton b = new JButton(names[i]);
            b.setBounds(20 + (i%5)*100, 20 + (i/5)*50, 90, 30);
            b.addActionListener(this);
            add(b);
        }
        setSize(550,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand();
        repaint(); // redraw
    }
    public void paint(Graphics g) {
        super.paint(g);
        if(shape.equals("Circle"))
            g.drawOval(200,150,100,100);
        else if(shape.equals("Oval"))
            g.drawOval(200,150,150,100);
        else if(shape.equals("Rectangle"))
            g.drawRect(200,150,150,100);
        else if(shape.equals("Square"))
            g.drawRect(200,150,100,100);
        else if(shape.equals("Line"))
            g.drawLine(200,150,350,250);
        else if(shape.equals("Arc"))
            g.drawArc(200,150,150,100,0,180);
        else if(shape.equals("RoundRect"))
            g.drawRoundRect(200,150,150,100,30,30);
        else if(shape.equals("3DRect"))
            g.draw3DRect(200,150,150,100,true);
        else if(shape.equals("FillOval"))
            g.fillOval(200,150,150,100);
        else if(shape.equals("FillRect"))
            g.fillRect(200,150,150,100);
    }
    public static void main(String[] args) {
        new ShapeFrame();
    }
}
```
<img width="392" height="278" alt="image" src="https://github.com/user-attachments/assets/83376d8e-3066-4bf5-98a6-0438a17332f0" />

## assci-27
```
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaintBrush extends JFrame {
    int x1, y1, x2, y2;
    Color color = Color.BLACK;
    int width = 2;
    public PaintBrush() {
        setTitle("Paint Brush");
        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton green = new JButton("Green");
        Integer sizes[] = {2,4,6,8,10};
        JComboBox cb = new JComboBox(sizes);
        red.setBounds(20,40,70,30);
        blue.setBounds(100,40,70,30);
        green.setBounds(180,40,80,30);
        cb.setBounds(280,40,70,30);
        add(red); add(blue); add(green); add(cb);
        red.addActionListener(e -> color = Color.RED);
        blue.addActionListener(e -> color = Color.BLUE);
        green.addActionListener(e -> color = Color.GREEN);
        cb.addActionListener(e -> width = (int)cb.getSelectedItem());
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                Graphics g = getGraphics();
                g.setColor(color);
                ((Graphics2D)g).setStroke(new BasicStroke(width));
                g.drawLine(x1, y1, x2, y2);
                x1 = x2;
                y1 = y2;
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
        });
        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PaintBrush();
    }
}
```
<img width="352" height="282" alt="image" src="https://github.com/user-attachments/assets/df7add16-d2d3-4812-b0cf-2eae840d0008" />

## assci-28
```
import mypack.*;
public class TestPackage {
    public static void main(String[] args) {
        Add a = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();
        Square sq = new Square();
        System.out.println("Addition: " + a.add(10,5));
        System.out.println("Subtraction: " + s.sub(10,5));
        System.out.println("Multiplication: " + m.mul(10,5));
        System.out.println("Division: " + d.div(10,5));
        System.out.println("Square: " + sq.square(5));
    }
}
```
<img width="118" height="65" alt="image" src="https://github.com/user-attachments/assets/061e384c-8b6a-478c-b8f5-2716073a7da5" />

## assci-29
```
import mypack.Add;
import mypack.subpack.Square;
public class TestPackage {
    public static void main(String[] args) {
        Add a = new Add();
        Square s = new Square();
        System.out.println("Addition: " + a.add(10,5));
        System.out.println("Square: " + s.square(5));
    }
}
```
<img width="81" height="26" alt="image" src="https://github.com/user-attachments/assets/ef6501f9-b224-4c76-af4a-3a7af992a1b4" />

## assci-30
```
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
```
<img width="232" height="26" alt="image" src="https://github.com/user-attachments/assets/c7700878-33f7-4926-9e20-609f869a27a9" />

## assci-31
```
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
```
<img width="81" height="24" alt="image" src="https://github.com/user-attachments/assets/68c0ca6e-c159-495a-8e24-edab6b93745b" />

## assci-32
```
interface Shape {
    void area();
}
abstract class Vehicle {
    abstract void start();
    void fuel() {
        System.out.println("Fuel is required");
    }
}
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
class Circle implements Shape {
    public void area() {
        int r = 5;
        System.out.println("Circle Area = " + (3.14 * r * r));
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}
public class AllInOneDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        Shape s = new Circle();
        s.area();
        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}
```
<img width="115" height="65" alt="image" src="https://github.com/user-attachments/assets/ca569d3e-7f5e-4b47-b71b-e732ac425d5e" />

## assci-33
```
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
```
<img width="126" height="103" alt="image" src="https://github.com/user-attachments/assets/c688abf3-665a-4d36-aba3-5ecc53155edf" />
