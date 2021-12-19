package ru.mirea.task22;

public class Pleb extends UserClass
{
    int warns;
    public Pleb(String login, String password,int warns) {
        super(login, password);
        this.warns = 0;
    }
    public Pleb(){
        warns = 0;
    }
}
