package ru.mirea.task5.first;

public abstract class Dish
{
    protected String color;
    protected String material;
    protected double radius;

    public Dish() {}
    public Dish(String color, String material)
    {this.color = color; this.material = material;}

    public String getColor() {return color;}
    public void setColor(String c) {color = c;}
    public String getMaterial() {return material;}
    public void setMaterial(String material) {this.material = material;}
    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    public double getArea()
    {return Math.PI * Math.pow(radius, 2);}

    abstract public String toString();
}
