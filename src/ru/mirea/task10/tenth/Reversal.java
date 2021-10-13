package ru.mirea.task10.tenth;

import java.lang.*;

public class Reversal
{
    private int number;
    private static int sum = 0;
    public Reversal(int n)
    {number = n;}
    public void setNumber(int number) {this.number = number;}
    public int getReversal() {return sum;}

    public void magic()
    {
        if (number/10 !=0)
        {
            int a;
            a = number%10;
            sum*=10;
            sum+=a;
            number/=10;
            magic();
        }
        else {
            sum *= 10;
            sum += number;
        }
    }

    public static void main(String[] args)
    {
        Reversal num1 = new Reversal(74127);
        num1.magic();
        System.out.println(num1.getReversal());
    }
}
