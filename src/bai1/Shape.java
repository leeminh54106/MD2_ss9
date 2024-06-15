package bai1;

public class Shape implements Resizable{
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

    public String toString() {
        return "hình dạng có màu " + this.getColor() + " và " + (this.filled ? "điền" : "chưa được điền");
    }

    @Override
    public void resize(double percent) {

    }
}