// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    // Implementation of abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Implementation of abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calling methods on objects
        circle.display();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
