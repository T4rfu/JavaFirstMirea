package ru.mirea.task4.first;

import java.lang.*;
public class TestAuthor
{
    public static void main(String[] args)
    {
        Author a1 = new Author("Vova Vist", 'M',"fizon@mail.ru");
        Author a2 = new Author("Tanya Popova", 'F');
        a2.setEmail("lav@minecraft.org");
        System.out.println(a1);
        System.out.println(a2);
    }
}
