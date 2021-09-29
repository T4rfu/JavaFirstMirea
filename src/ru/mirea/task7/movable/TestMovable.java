package ru.mirea.task7.movable;

public class TestMovable
{
    public static void main(String[] args)
    {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point);
        for(int i = 0; i < 10; i++) {point.moveUp();}
        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(1, -1, 1, 1, 5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 1, 1, 1, 1);
        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}