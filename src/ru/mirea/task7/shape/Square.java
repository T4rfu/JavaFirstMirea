package ru.mirea.task7.shape;

public class Square extends Rectangle
{
    public Square() {}
    public Square(double side)
    {super(side, side);}
    public Square(double side, String color, boolean filled)
    {super(side, side, color, filled);}
    public double getSide() {return width;}
    public void setSide(double side) {width = side; length = side;}

    public void setWidth(double side) {setSide(side);}
    public void setLength(double side) {setSide(side);}
    public String toString()
    {
        return "Square with side = " + getSide() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }
}