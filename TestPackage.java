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