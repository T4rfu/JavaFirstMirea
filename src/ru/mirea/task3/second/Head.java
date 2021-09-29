package ru.mirea.task3.second;

public class Head extends Human
{
    protected int intelligence;

    public Head(int h, int i, String a)
    {
        health = h;
        intelligence = i;
        armor = a;
    }
    public int getIntelligence() {return intelligence;}
    public void setIntelligence(int i) {intelligence = i;}
    public double abilityCheck() {return intelligence*=health/100;}

    public String toString()
    {
        return "The human's head armored with "+armor+" has "+abilityCheck()+" intelligence.";
    }
}
