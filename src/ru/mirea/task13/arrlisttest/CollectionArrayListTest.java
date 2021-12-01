package ru.mirea.task13.arrlisttest;
import java.util.ArrayList;

public class CollectionArrayListTest
{
    public static void main(String[] args)
    {
        //конструктор и добавление элементов
        ArrayList<String> stages = new ArrayList<>();
        stages.add("denial");
        stages.add("anger");
        stages.add("auction");
        stages.add("acceptance");
        stages.add(3,"depression");
        System.out.println(stages);

        //соединение списков
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("milk");
        list1.add("bread");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("orange");
        list1.addAll(1,list2);
        System.out.println(list1);

        //копирование и очистка
        ArrayList<String> copyOfStages = (ArrayList<String>) stages.clone();
        stages.clear();
        System.out.println(copyOfStages);
        stages.add("aboba");
        System.out.println(stages);

        //проверка на наличие
        System.out.println(list1.contains("milk"));
        System.out.println(list1.contains("oreo"));

        //get
        String get = list1.get(1);
        System.out.println(get);

        //isEmpty
        ArrayList<String> temp = new ArrayList<>();
        temp.add("one");
        temp.add("two");
        System.out.println(temp);
        temp.remove(0);
        System.out.println(temp);
        temp.clear();
        if(temp.isEmpty())
        {System.out.println("Пустота");}

        //toArray
        String[] array = new String[list1.size()];
        list1.toArray(array);
        for(int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
