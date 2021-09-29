package ru.mirea.task1;

import java.util.Scanner;

public class Lab1Seventh
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        int fac = 1;

        for (int i = 1; i < number; i++) {
            fac += fac*i;
        }
        System.out.println("Факториал: ");
        System.out.println(fac);
    }
}
