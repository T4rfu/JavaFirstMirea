package ru.mirea.task10.eleventh;

import java.lang.*;
import java.util.Scanner;

public class amountOfOnes{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        long number = sc.nextInt();

        while (true)
        {
            if (number%100==0)
            {
                int sum = 0;
                while(number/10!=0) {

                    if (number % 10 == 1) {
                        sum++;
                    }
                    number /= 10;
                }
                System.out.println(sum+1);
                break;
            }
            number/=10;
        }
    }
}