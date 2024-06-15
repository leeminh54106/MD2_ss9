package bai4.rikkei.academy;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void display() {
        System.out.println("hình tròn");
        System.out.println("diện tích: " + getArea());
        System.out.println(getColor());
        System.out.println("-------------------");
    }
}
