package ru.mirea.task5.first;

public class Cup extends Dish {
    protected boolean handle;
    protected double height;
    protected String ishandle;

    public Cup(String color, String material, double radius,
               double height, boolean handle) {
        this.color = color;
        this.material = material;
        this.radius = radius;
        this.height = height;
        if(handle)
        {ishandle = "with a handle";}
        else {ishandle = "without handle";}
    }
    public double getVolume() {
        return getArea() * height;
    }
    public String toString() {
        return "The " + color + " cup "+ishandle+" made of " + material + ". " +
                "Area = " + getArea() +
                ". Volume = " + getVolume()+".";
    }
}