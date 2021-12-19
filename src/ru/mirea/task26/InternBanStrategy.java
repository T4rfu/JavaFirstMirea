package ru.mirea.task26;

public class InternBanStrategy implements BanStrategy{

    @Override
    public void ban() {
        System.out.println("Стажер не может раздавать баны(((");
    }
}
