package ru.mirea.task2.second;

import ru.mirea.task2.second.Ball;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("football");
        Ball b2 = new Ball("polo", "blue");
        Ball b3 = new Ball("basketball", 30);

        b2.setRadius(20);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
