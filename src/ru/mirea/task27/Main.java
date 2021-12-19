package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> logAndPass = new HashMap<>();

//повторно имя вводить не получится, так как оно является ключом
//если будет два одинаковых имени, то будет выводиться последнее введенное

        logAndPass.put("Tarfu", 8148);
        logAndPass.put("1classFunPage", 2323);
        logAndPass.put("Zakaliukin", 6666);

        System.out.println(logAndPass);

        // доступ по ключу
        int myPass = logAndPass.get("Tarfu");
        System.out.println(myPass);

        // удаление неверных
        logAndPass.remove("Zakaliukin");
        System.out.println(logAndPass);

        //перебор HashMap в цикле
        for (Map.Entry entry: logAndPass.entrySet()) {

            System.out.println(entry);

        }

    }

}