package ru.mirea.task3.second;

public class TestHuman
{
    public static void main(String[] args) {
        Human head1 = new Head(90, 80, "helmet");
        Human hand1 = new Hand(60, 85, "leather gloves");
        Human leg1 = new Leg(20, 99, "army boots with white laces");

        System.out.println(head1);
        System.out.println(hand1);
        System.out.println(leg1);
    }
}
