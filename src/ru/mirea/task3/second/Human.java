package ru.mirea.task3.second;

public abstract class Human
{
    protected String armor;
    protected double health;

    public Human() {}
    public String getArmor() {return armor;}
    public void setArmor(String arm) {armor = arm;}
    public double getHealth() {return health;}
    public void setHealth(double hea) {health = hea;}

    abstract public double abilityCheck();
    abstract public String toString();
}
