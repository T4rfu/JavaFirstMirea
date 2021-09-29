package ru.mirea.task6.first;

public class NameableAnimal implements Nameable
{
    protected String name;

    public NameableAnimal(String name)
    {
        this.name = name;
    }

    public String getName() {return name;}
}
