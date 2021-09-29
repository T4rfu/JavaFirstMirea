package ru.mirea.task2.fourthAndFifth;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog dogges [] = new Dog[10];

        dogges[1] = new Dog("Mike", 2);
        dogges[2] = new Dog("Helen", 7);
        dogges[3] = new Dog("Bob");
        dogges[3].setAge(1);
        System.out.println(dogges[1]);
        dogges[1].intoHumanAge();
        dogges[2].intoHumanAge();
        dogges[3].intoHumanAge();
    }
}