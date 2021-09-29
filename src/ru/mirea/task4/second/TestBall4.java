package ru.mirea.task4.second;

import java.lang.*;
public class TestBall4 {
    public static void main(String[] args)
    {
        Ball4 b1 = new Ball4(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        b1.move(-100, 90);
        System.out.println(b1);
    }
}