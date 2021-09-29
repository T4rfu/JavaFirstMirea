package ru.mirea.task5.second;

public class Basenji extends Dog5
{
    protected int power;

    public Basenji(String name, String color,String origin, String function, int averageHeight, int power)
    {
        super(name,color, origin,function,averageHeight);
        this.power = power;
    }
    public String toString()
    {
        return "A "+color+" Basenji dog named "+name+" was bred in "+origin+". It's main function is "+
                function+". It's average height is "+averageHeight+" centimetres. "+
                "It's power is "+power+".";
    }
}
