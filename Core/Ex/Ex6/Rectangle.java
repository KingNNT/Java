
public class Rectangle {
    protected double width, length;

    Rectangle() {
        this.width = this.length = 0;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean fill) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = fill;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getParimeter() {
        return (this.width + this.length) * 2;
    }

    public String toString() {
        return ("A Rectangle with width = " + this.width + " and length = " + this.length + ", which is a subclass of " + super.toString());
    }
}