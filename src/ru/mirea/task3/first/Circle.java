package ru.mirea.task3.first;

public class Circle
{
    protected String color;
    protected boolean filled;
    protected double radius;

    public Circle()
    {
        radius = 20;
        color = "blue";
        filled = true;
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
