package ru.mirea.task6.second;

import ru.mirea.task6.first.NameableAnimal;
import ru.mirea.task6.first.NameableCar;
import ru.mirea.task6.first.NameablePlanet;

public class TestPriceable
{
    public static void main(String[] args) {
        PriceableCar Supra = new PriceableCar(15000);
        int c = Supra.getPrice();
        PriceableSoul soul = new PriceableSoul(666);
        int s = soul.getPrice();
        PriceableFurniture sofa = new PriceableFurniture(300);
        int f = sofa.getPrice();

        System.out.println("Toyota Supra : "+c+"$");
        System.out.println("Soul : "+s+"o̦̹");
        System.out.println("Black sofa : "+f+"$");
    }
}
