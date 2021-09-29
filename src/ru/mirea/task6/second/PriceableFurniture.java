package ru.mirea.task6.second;

public class PriceableFurniture implements Priceable
{
    protected int price;

    public PriceableFurniture(int price)
    {
        this.price = price;
    }

    public int getPrice() {return price;}
}
