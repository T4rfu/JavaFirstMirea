package ru.mirea.task5.first;

public class Plate extends Dish
{
    public Plate(String color, String material, double radius)
    {
        this.color = color;
        this.material = material;
        this.radius = radius;
    }
    public String toString()
    {
        return "The "+color+" plate made of "+material+". "+
            "Area = "+getArea()+".";
    }

}
