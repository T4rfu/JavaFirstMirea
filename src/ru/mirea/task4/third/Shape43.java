package ru.mirea.task4.third;

public abstract class Shape43
{
    protected String color;
    protected boolean filled;

    public Shape43() {}
    public Shape43(String c, boolean f)
    {color = c; filled = true;}
    public String getColor() {return color;}
    public void setColor(String c) {color = c;}
    public boolean isFilled() {return filled;}
    public void setFilled (boolean f) {filled = f;}
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
