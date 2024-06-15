package bai2;



public abstract class Shape  {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
public abstract double getArea();
    public String toString() {
        return "hình dạng có màu " + this.getColor() + " và " + (this.filled ? "điền" : "chưa được điền");
    }


}