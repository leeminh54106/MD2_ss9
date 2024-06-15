package bai1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    public void setWidth(double width) {
        this.setSide(width);
    }

    public void setHeight(double height) {
        this.setSide(height);
    }

    public String toString() {
        return "A Square with side = " + this.getSide() + ", which is a subclass of " + super.toString();
    }
}
