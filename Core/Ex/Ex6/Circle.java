
public class Circle extends Shape{
    private double radius;
    
    Circle() {
        this.radius = 0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean fill) {
        this.radius = radius;
        super.Shape(color, fill);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    public double getParimeter() {
        return this.radius * 2 * 3.14;
    }

    public String toString() {
        return ("A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString());
    }
}