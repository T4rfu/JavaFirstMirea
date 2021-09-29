package ru.mirea.task2.second;

import java.lang.*;
public class Ball
{
    private String type;
    private String color;
    private double radius;

    public Ball(String type)
    {this.type = type; color = "Red"; radius = 25;}
    public Ball(String type, String color, double radius)
    {this.type = type; this.color = color; this.radius = radius;}
    public Ball(String type, String color)
    {this.type = type; this.color = color; radius = 25;}
    public Ball(String type, double radius)
    {this.type = type; this.radius = radius; color = "Red";}

    public void setColor(String color)
    {this.color = color;}
    public void setRadius(double radius)
    {this.radius = radius;}
    public String getType(String type)
    {return type;}
    public String getColor()
    {return color;}
    public double getRadius()
    {return radius;}
    public String toString()
    {return "This "+color+" ball for "+type+" has a radius of "+radius;}
}
