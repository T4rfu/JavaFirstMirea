package ru.mirea.task22;

public class Admin extends UserClass
{
    int bansToGive;
    public Admin(String login, String password,int bansToGive) {
        super(login, password);
        this.bansToGive = bansToGive;
    }
    public Admin(){
        bansToGive = 3; //not enough
    }

    public void ban(String lg){
    }
}
