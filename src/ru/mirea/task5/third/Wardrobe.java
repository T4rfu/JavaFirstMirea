package ru.mirea.task5.third;

public class Wardrobe extends Furniture
{
    protected int capacity;

    public Wardrobe(int price,double area, String material, String color,
                int quality, int capacity)
    {
        super(price, area, material,color,quality);
        this.capacity = capacity;
    }
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity)
    {this.capacity = capacity;}

    public String toString()
    {
        return color+" wardrobe: ("+material+")"+"\n"+
                "Area: "+area+"\n"+
                "Capacity: "+capacity+"\n"+
                "Price: "+price;
    }
}
