package ru.mirea.task25;
//что-то типа покупки статуса для пользователя ( ° ʖ °)

public class Main {
    public static void main(String[] args) {
        double cost;
        Service vip = new Vip("Default", 300);
        Service diamond = new DiamondVip(vip);
        System.out.println(diamond.getPrice());
    }
}
