package ru.mirea.task13.linktest;
import java.util.LinkedList;

//LinkedList раньше имел преимущество над arrayList за счет скорости добавления/удаления элементов,
//но сейчас arrayList превосходит его во всем

public class CollectionLinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("milk");
        list.addFirst("apple");
        list.add(1, "bread");
        System.out.printf("Количество элементов: ", list.size());
        System.out.println(list.get(1));
        list.set(2, "orange");
        for(String product : list){
            System.out.println(product);
        }
        if(list.contains("milk")){
            System.out.println("milk есть в списке");
            list.remove("milk");
        }
        list.removeFirst();
        list.removeLast();
    }
}
