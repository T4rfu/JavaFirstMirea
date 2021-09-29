package ru.mirea.task3.second;

public class Leg extends Human
{
    protected int speed;

    public Leg(int h, int s, String a)
    {
        health = h;
        speed = s;
        armor = a;
    }
    public int getSpeed() {return speed;}
    public void setSpeed(int s) {speed = s;}
    public double abilityCheck() {return speed*=health/100;}

    public String toString()
    {
        return "The human's legs armored with "+armor+" has "+abilityCheck()+" speed.";
    }
}
