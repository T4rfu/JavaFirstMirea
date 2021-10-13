package ru.mirea.task1;

public class Lab1Third
{
        private static int[] arr = new int[] {1, 2, 3, 4 ,5, 6 };
        private static int sum;

    public static void main(String[] args)
    {
        for(int i = 0; i < 6; i++)
            sum+=arr[i];
        System.out.println(sum);
    }
}
