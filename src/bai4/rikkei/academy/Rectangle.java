package bai4.rikkei.academy;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
    @Override
    public void display(){
        System.out.println("hình vuông");
        System.out.println("diện tích : " + getArea());
        System.out.println(getColor());
    }
}
