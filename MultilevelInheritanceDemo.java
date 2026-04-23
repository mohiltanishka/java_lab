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