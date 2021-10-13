package ru.mirea.task10.twelfth;
import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        long num = sc.nextInt();
        double oddN = 0;
        int i = 1;
        while(true)
        {
            if(num%10 == 0)
            {
                num/=10;
                while(true)
                {
                    if(num!=0)
                    {
                        if (num % 2 == 0)
                        {
                            num /= 10;
                        }
                        else
                        {
                            oddN += num % 10;
                            oddN /= 10;
                            i *= 10;
                            num/=10;
                        }
                    }
                    else
                        break;
                }
                break;
            }
            else
                num/=10;
        }
        oddN*=i;
        int a = (int)oddN;
        System.out.println(a);
    }
}

