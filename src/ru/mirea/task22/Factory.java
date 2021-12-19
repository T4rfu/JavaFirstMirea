package ru.mirea.task22;
import java.util.ArrayList;
import java.util.List;

enum UserType{
    PLEB,
    ADMIN;
}

public class Factory {
    List users = new ArrayList<>();
    public void createUser(UserType type, List users){
        UserClass temp = null;
        switch(type){
            case PLEB: {
                temp = new Pleb();
                users.add(temp);
                break;
            }
            case ADMIN: {
                temp = new Admin();
                users.add(temp);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Factory test = new Factory();
        List userList = new ArrayList<>();
        test.createUser(UserType.PLEB, userList);
        test.createUser(UserType.PLEB, userList);
        test.createUser(UserType.ADMIN, userList);
        for(int i = 0; i<userList.size(); i++){
            Object user = userList.get(i);
            System.out.println(user);
        }
    }
}