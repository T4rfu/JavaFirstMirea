package ru.mirea.task6.first;

public class NameableCar implements Nameable
{
    protected String name;

    public NameableCar(String name)
    {
        this.name = name;
    }

    public String getName() {return name;}
}
