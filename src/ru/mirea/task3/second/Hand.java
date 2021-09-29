package ru.mirea.task3.second;

public class Hand extends Human
{
    protected int power;

    public Hand(int h, int p, String a)
    {
        health = h;
        power = p;
        armor = a;
    }
    public int getPower() {return power;}
    public void setPower(int p) {power = p;}
    public double abilityCheck() {return power*=health/100;}

    public String toString()
    {
        return "The human's hands armored with "+armor+" has "+abilityCheck()+" power.";
    }
}
