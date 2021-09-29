package ru.mirea.task2.third;

import java.lang.*;
public class TestBookOne
{
    public static void main(String[] args)
    {
        BookOne b1 = new BookOne("Spitfire",88);
        BookOne b2 = new BookOne("Lynx",14);
        BookOne b3 = new BookOne();
        BookOne b4 = new BookOne("AmongUs",12);
        b4.setPages(43);
        System.out.println(b1);
        b1.timeOfReading();
        b2.timeOfReading();
        b3.timeOfReading();
        b4.timeOfReading();
    }
}


