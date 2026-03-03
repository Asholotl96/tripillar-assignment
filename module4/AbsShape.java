abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    double radius = 5.0;
    void area() {
        System.out.println("Circle Area: " +(3.14 *radius*radius));
    }
}
class Rectangle extends Shape {
    int l = 10, b = 5;
    void area() {
        System.out.println("Rectangle Area: " +(l*b));
    }
}
public class AbsShape {
    public static void main(String[] args) {
        new Circle().area();
        new Rectangle().area();
    }
}