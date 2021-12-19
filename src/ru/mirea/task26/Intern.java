package ru.mirea.task26;

public class Intern extends Administration {
    public Intern(){
        super(new InternBanStrategy());
    }
}
