package ru.mirea.task6.first;

public class NameablePlanet implements Nameable
{
    protected String name;

    public NameablePlanet(String name)
    {
        this.name = name;
    }

    public String getName() {return name;}
}
