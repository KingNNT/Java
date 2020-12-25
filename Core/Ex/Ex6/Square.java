
public class Square extends Rectangle{

    private double side;

    public Square() {
        this.side = 0;
    }
    
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean fill) {
        this.side = side;
        this.color = color;
        this.filled = fill;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}