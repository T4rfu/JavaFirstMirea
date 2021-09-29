package ru.mirea.task4.third;

public class Circle43 extends Shape43 {
    protected double radius;

    public Circle43() {
    }

    public Circle43(double r, String c, boolean f) {
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