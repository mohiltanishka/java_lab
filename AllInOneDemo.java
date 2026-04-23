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