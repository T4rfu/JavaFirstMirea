package ru.mirea.task5.second;

public abstract class Dog5
{
    protected String name;
    protected String color;
    protected String origin;
    protected String function;
    protected int averageHeight;


    public Dog5(String name, String color,String origin, String function, int averageHeight)
    {
        this.name = name;
        this.color = color;
        this.origin = origin;
        this.function = function;
        this.averageHeight = averageHeight;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public String getOrigin() {return origin;}
    public void setOrigin(String origin) {this.origin = origin;}
    public String getFunction() {return function;}
    public void setFunction(String function) {this.function = function;}
    public int getAverageHeight() {return averageHeight;}
    public void setAverageHeight(int averageHeight) {this.averageHeight = averageHeight;}

    abstract public String toString();
}
