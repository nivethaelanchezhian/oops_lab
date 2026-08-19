abstract class Shape {
    abstract void area();
}

// Circle class
class Circle extends Shape {
    double radius = 5;

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
