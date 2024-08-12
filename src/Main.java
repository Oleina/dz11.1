import java.awt.Color;

// Интерфейс Shape со стандартными методами
interface Shape {
    double getPerimeter();
    double getArea();

    Color getFillColor();
    void setFillColor(Color color);

    Color getBorderColor();
    void setBorderColor(Color color);

    default void printDetails() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}

// Класс Circle, реализующий интерфейс Shape
class Circle implements Shape {
    private double radius;
    private Color fillColor;
    private Color borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getBorderColor() {
        return borderColor;
    }

    @Override
    public void setBorderColor(Color color) {
        this.borderColor = color;
    }
}

// Класс Rectangle, реализующий интерфейс Shape
class Rectangle implements Shape {
    private double width;
    private double height;
    private Color fillColor;
    private Color borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getBorderColor() {
        return borderColor;
    }

    @Override
    public void setBorderColor(Color color) {
        this.borderColor = color;
    }
}

// Класс Triangle, реализующий интерфейс Shape
class Triangle implements Shape {
    private double a, b, c;
    private Color fillColor;
    private Color borderColor;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getBorderColor() {
        return borderColor;
    }

    @Override
    public void setBorderColor(Color color) {
        this.borderColor = color;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setFillColor(Color.RED);
        circle.setBorderColor(Color.BLACK);

        Rectangle rectangle = new Rectangle(4, 7);
        rectangle.setFillColor(Color.GREEN);
        rectangle.setBorderColor(Color.BLUE);

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setFillColor(Color.YELLOW);
        triangle.setBorderColor(Color.MAGENTA);

        Shape[] shapes = { circle, rectangle, triangle };

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");
            shape.printDetails();
            System.out.println();
        }
    }
}