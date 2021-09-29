package ru.mirea.task1;
import java.lang.*;
import java.util.Random;

public class Lab1Sixth {
    public static void main(String[] args) {
        int[] array;
        array = new int[12];
        int i;
        System.out.println("Изначальный массив:");
        for (i = 0; i < array.length; i++)
        {
            array[i] = ((int) (Math.random() * 100));
            System.out.println(array[i]);
        }
        for (i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
