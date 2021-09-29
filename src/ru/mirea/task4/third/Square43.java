package ru.mirea.task4.third;

public class Square43 extends Rectangle43
{
    public Square43() {}
    public Square43(double side)
    {super(side, side);}
    public Square43(double side, String color, boolean filled)
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