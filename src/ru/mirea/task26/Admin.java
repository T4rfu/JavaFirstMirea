package ru.mirea.task26;

public class Admin extends Administration {

    public Admin() {
        super(new StandartBanStrategy());
    }
}
