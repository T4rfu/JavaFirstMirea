package ru.mirea.task26;

public class StandartBanStrategy implements BanStrategy {
    @Override
    public void ban() {
        System.out.println("Вершить правосудие");
    }
}