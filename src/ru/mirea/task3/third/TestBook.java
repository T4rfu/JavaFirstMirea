package ru.mirea.task3.third;

import ru.mirea.task2.third.BookOne;

import java.lang.*;
public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Spitfire", "Madisson", 88, 1985);
        Book b2 = new Book("Yasos","Biba",14, 2010);
        Book b3 = new Book();
        Book b4 = new Book("AmongUs","Danich",12,1984);
        b4.setPages(43);
        System.out.println(b1);
        b1.timeOfReading();
        b2.timeOfReading();
        b3.timeOfReading();
        b4.timeOfReading();
    }
}
