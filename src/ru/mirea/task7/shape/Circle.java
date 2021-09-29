package ru.mirea.task7.shape;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }

    public Circle(double r, String c, boolean f) {
        radius = r;
        color = c;
        filled = f;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle with radius = " + radius +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }
}
