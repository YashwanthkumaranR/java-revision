public class ShapeDemo {

    public static void main(String[] args) {


        Circle circle = new Circle(10);
        double circleArea = circle.area();
        System.out.println("Circle Area: " + circleArea);

        Rectangle rectangle = new Rectangle(10, 2);
        double rectangleArea = rectangle.area();
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}

interface Shape {
    double area();
}

class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}