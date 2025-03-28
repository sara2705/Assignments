package InheritanceTask;

public class ShapesInh {
	public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Triangle(3, 4, 5) };
        
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("-------------------------");
        }
    }
}
abstract class Shape {
    abstract void draw();
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
    
    @Override
    double area() {
        return width * height;
    }
    
    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double a, b, c;
    
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
    
    @Override
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    @Override
    double perimeter() {
        return a + b + c;
    }
}

