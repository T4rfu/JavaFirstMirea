package ru.mirea.task6.second;

import ru.mirea.task6.first.Nameable;

public class PriceableCar implements Priceable
{
    protected int price;

    public PriceableCar(int price)
    {
        this.price = price;
    }

    public int getPrice() {return price;}
}