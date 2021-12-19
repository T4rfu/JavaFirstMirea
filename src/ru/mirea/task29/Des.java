package ru.mirea.task29;

import java.io.*;

public class Des {

    //запускать вторым.....................................................

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("src/ru/mirea/task29/info.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SavedData savedData = (SavedData) objectInputStream.readObject();

        System.out.println(savedData);
    }
}