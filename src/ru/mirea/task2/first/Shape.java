package ru.mirea.task2.first;
import java.lang.*;

public class Shape
{
    private String type;
    public Shape()
    {type = "Circle";}
    public Shape(String n)
    {this.type = n;}
    public void setType(String type)
    {this.type = type;}
    public String getType(String type)
    {return type;}
    public String toString() {return "Фигура - "+type;}
}
