package ru.mirea.task30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private int age;
    private static Map<Integer, User> allUsers;
    private static int countId = 0;

    public User(String name, int age) {
        if (allUsers == null){
            allUsers = new HashMap<>();
        }

        this.name = name;
        this.age = age;

        if (!hasUser()){
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }
    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }
    public static int getHowManyUsers(){
        return allUsers.size();
    }
    public static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }
    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyUsers();
    }

    public static void main(String[] args) {
        new User("Tarfu", 19);
        new User("1Class", 31);
        new User("Buk", 48);
        new User("Takumi", 19);
        new User("Kakke", 18);

        System.out.println("Пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       Всего пользователей: " + User.getHowManyUsers());
        System.out.println("================================================");
        System.out.println("       Общий возраст пользователей: " + User.getAllAgeUsers());
        System.out.println("================================================");
        System.out.println("       Средний возраст пользователей: " + User.getAverageAgeOfAllUsers());
        System.out.println("================================================");
    }
}