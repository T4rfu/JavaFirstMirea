package ru.mirea.task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class abobaTest
{
    public static void main(String[] args) {
        Queue<Integer> first = new LinkedList();
        first.add(1);
        first.add(2);
        first.add(3);
        int i = first.poll();
        first.add(i);

        System.out.println(first);
    }
}
