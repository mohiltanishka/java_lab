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