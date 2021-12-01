package ru.mirea.task18;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int users[] = {1,2,3};

        for(int i = 0; i < 4;i++)
        {
            try
            {
                System.out.println(users[i]);
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Выход за пределы массива");
            }
        }
    }
}
