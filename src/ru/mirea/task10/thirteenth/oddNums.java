package ru.mirea.task10.thirteenth;
import java.util.Scanner;


public class oddNums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        long oNum = sc.nextInt();
        double odN = 0;
        int j = 1;
        while(true)
        {
            if(oNum%10 == 0)
            {
                oNum/=10;
                int i = (int)Math.log10(oNum)+1;
                if(i%2==0)
                {
                    oNum/=10;
                    i-=1;
                    for(int k = 0;k<=(i-1)/2;k++)
                    {
                        odN+=oNum%10;
                        odN/=10;
                        j*=10;
                        oNum/=10;
                        oNum/=10;
                    }
                    break;
                }
                else
                {
                    for(int k = 0;k<=(i-1)/2;k++)
                    {
                        odN+=oNum%10;
                        odN/=10;
                        j*=10;
                        oNum/=10;
                        oNum/=10;
                    }
                    break;
                }
            }
            else
                oNum/=10;
        }
        odN=odN*j;
        int a = (int)odN;
        System.out.println(a);

    }
}
