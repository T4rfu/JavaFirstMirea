package ru.mirea.task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class alcoholFu
{
    public static void main(String[] args)
    {
        ArrayList<Integer> deck = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

        Queue<Integer> first = new LinkedList();
        int j = 10;
        for(int i = 0; i < 5; i++, j--) {
            int temp = (int) (Math.random() * j);
            first.add(deck.get(temp));
            deck.remove(temp);
        }

        Queue<Integer> second = new LinkedList();
        second.addAll(deck);

        int count = 1;

        while(count <= 106)
        {
            if(first.isEmpty()) {
                System.out.println("Победил второй игрок ");
                System.exit(1);
            }
            else if(second.isEmpty()) {
                System.out.println("Победил первый игрок ");
                System.exit(1);
            }
            int fp = first.poll();
            int sp = second.poll();
            boolean a = sp==0&&fp==9;
            boolean b = sp==9&&fp==0;
            System.out.println("Ход: "+ count);
            System.out.println("Первый: "+fp+ " Второй: "+sp);
            if((fp > sp && !a)||(fp==0&&sp==9))
            {
                System.out.println("Первый получает карты.");
                first.add(fp);
                first.add(sp);
            }
            else if((fp < sp && !b)||(sp==0&&fp==9))
            {
                System.out.println("Второй получает карты.");
                second.add(fp);
                second.add(sp);
            }
            count++;
        }
        System.out.println("botva");
    }
}
