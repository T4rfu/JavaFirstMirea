package ru.mirea.task5.third;

public class Sofa extends Furniture
{
    protected int amountOfPillows;

    public Sofa(int price,double area, String material, String color,
                int quality, int amountOfPillows)
    {
        super(price, area, material,color,quality);
        this.amountOfPillows = amountOfPillows;
    }
    public int getAmountOfPillows() {return amountOfPillows;}
    public void setAmountOfPillows(int amountOfPillows)
    {this.amountOfPillows = amountOfPillows;}

    public String toString()
    {
        return color+" sofa: ("+material+")"+"\n"+
                "Area: "+area+"\n"+
                "Pillows: "+amountOfPillows+"\n"+
                "Price: "+price;
    }
}
