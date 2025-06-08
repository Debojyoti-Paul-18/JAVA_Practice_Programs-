class Shape {
    void area() {
        System.out.println("Area of shape is unknown");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Method_Overriding{
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area();  // calls Circle's area()
        s2.area();  // calls Rectangle's area()
    }
}
