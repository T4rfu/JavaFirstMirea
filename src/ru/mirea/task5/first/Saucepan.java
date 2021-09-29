package ru.mirea.task5.first;

public class Saucepan extends Dish
{
    protected boolean handle;
    protected boolean lid;
    protected double height;
    protected String isHandle;
    protected String isLid;

    public Saucepan(String color, String material, double radius,
               double height, boolean handle, boolean lid) {
        this.color = color;
        this.material = material;
        this.radius = radius;
        this.height = height;
        if(lid)
        {isLid = "with a lid";}
        else {isLid = "without lid";}
        if(handle)
        {isHandle = "with a handle";}
        else {isHandle = "without handle";}
    }
    public double getVolume() {
        return getArea() * height;
    }
    public String toString() {
        return "The " + color + " saucepan "+isHandle+" and "+isLid+" made of " + material + ". "+
                "Area = " + getArea() +
                ". Volume = " + getVolume()+".";
    }
}
