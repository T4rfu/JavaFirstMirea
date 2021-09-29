package ru.mirea.task5.third;

public class Chair extends Furniture
{
    protected String type;

    public Chair(int price,double area, String material, String color,
                int quality, String type)
    {
        super(price, area, material,color,quality);
        this.type = type;
    }
    public String type() {return type;}
    public void type(String type) {this.type = type;}

    public String toString()
    {
        return type+color+" chair: ("+material+")"+"\n"+
                "Area: "+area+"\n"+
                "Price: "+price;
    }
}
