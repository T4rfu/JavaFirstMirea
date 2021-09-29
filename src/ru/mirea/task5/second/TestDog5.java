package ru.mirea.task5.second;

public class TestDog5
{
    public static void  main(String[] args)
    {
        Dog5 b1 = new Basenji("Tarfu","red","Africa", "hunting", 40, 100);
        Dog5 d1 = new Dachshund("Fubar","brown","German", "hunting", 35, 70);

        System.out.println(b1);
        System.out.println(d1);
    }
}

