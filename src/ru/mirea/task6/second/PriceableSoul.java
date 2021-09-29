package ru.mirea.task6.second;

public class PriceableSoul implements Priceable
{
    protected int price;

    public PriceableSoul(int price)
    {
        this.price = price;
    }

    public int getPrice() {return price;}
}