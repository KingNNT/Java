// package Ex6;

public class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        this.color = "";
        this.filled = true;
    }

    Shape(String color, boolean fill) {
        this.color = color;
        this.filled = fill;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return this.filled;
    }

    public void setFill(boolean fill) {
        this.filled = fill;
    }

    public String toString() {
        String check = "";
        if (this.isFill())
            check = "true";
        else
            check = "false";
        return ("A Shape with color of " + this.color + "and " + check);
    }

    public String demo() {
        return "NNT";
    }
}