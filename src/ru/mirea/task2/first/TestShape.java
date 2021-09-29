package ru.mirea.task2.first;

public class TestShape
{
    public static void main(String[] args) {
        Shape s1 = new Shape("Square");
        Shape s2 = new Shape("Rectangle");
        Shape s3 = new Shape();
        s2.setType("Triangle");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
