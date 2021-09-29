package ru.mirea.task7.shape;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle() {}
    public Rectangle(double w, double l)
    {width = w; length = l;}
    public Rectangle(double w, double l, String c, boolean f)
    {width = w; length = l; color = c; filled = f;}
    public double getWidth() {return width;}
    public void setWidth(double w) {width = w;}
    public double getLength() {return length;}
    public void setLength(double l) {length = l;}

    public double getArea()
    {return width * length;}
    public double getPerimeter()
    {return 2 * (width + length);}
    public String toString()
    {
        return "Rectangle with width = " + width +
                ", length = " + length +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }
}