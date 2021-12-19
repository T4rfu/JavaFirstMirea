package ru.mirea.task21;

import java.util.*;

//Без дженериков компилятор не будет замечать ошибку,
//если в список будут добавляться элементы разных
//типов данных, и при запуске программы пользователь получит ошибку.
//Но, используя их (<String>) компилятор укажет на то,
//что в список могут быть добавлены элементы только определенного типа данных

/*
public class GenericTest {
    public static void main(String []args){
        List list = new ArrayList();
        list.add("Nick");
        list.add("Coach");
        list.add(123); - из-за этого будет вызвана ошибка
        for (Object str : list) {
            System.out.println((String)str);
        }
    }
}
*/

public class GenericTest {
    public static void main(String []args){
        List<String> list = new ArrayList();
        list.add("Nick");
        list.add("Coach");
        //list.add(123); - вот на это будет ругаться компилятор
        for (Object str : list) {
            System.out.println((String)str);
        }
    }
}