package ru.mirea.task5.second;

public class Dachshund extends Dog5
{
    protected int length;

    public Dachshund(String name, String color, String origin, String function, int averageHeight, int length)
    {
        super(name, color,origin, function, averageHeight);
        this.length = length;
    }
    public String toString()
    {
        return "A "+color+" Dachshund dog named "+name+" was bred in "+origin+". It's main function is "+
                function+". It's average height is "+averageHeight+" centimetres. "+
                "It's length is "+length+" centimetres.";
    }
}

