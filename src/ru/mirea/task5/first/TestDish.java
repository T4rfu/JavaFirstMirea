package ru.mirea.task5.first;

public class TestDish
{
    public static void  main(String[] args)
    {
        Dish p1 = new Plate("red", "metal",5);
        Dish p2 = new Plate("white", "ceramics", 10);
        Dish c1 = new Cup("blue", "ceramics", 7, 15, true);
        Dish c2 = new Cup("gray", "aluminum", 6, 14, false);
        Dish s1 = new Saucepan("green", "oak", 19, 24,true,false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);
    }
}
