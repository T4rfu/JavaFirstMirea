package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CurrencyInfo {

    public static void main(String[] args) throws IOException {

    //запускать первым................................................

        //создаем наш объект
        String[] status = {"Не перебивайте волка, когда он молчит"};
        String[] pic = {"Постироничная картинка с котиком"};

        SavedData savedData = new SavedData(status, pic);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("src/ru/mirea/task29/info.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем информацию в файл
        objectOutputStream.writeObject(savedData);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();

    }
}