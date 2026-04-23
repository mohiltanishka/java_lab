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