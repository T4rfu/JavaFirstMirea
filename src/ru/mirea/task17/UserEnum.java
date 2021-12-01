package ru.mirea.task17;
enum User {user1, user2, user3, user4}

public class UserEnum
{
    public static void main(String[] args) {
        User user;
        user = User.user1;
        System.out.println("id : " + user);

        user = User.user2;
        if(user == User.user1) System.out.println("Первый пользователь");
        switch (user) {
            case user2:
                System.out.println("Второй пользователь");
                break;
            case user3:
                System.out.println("Третий пользователь");
                break;
            case user4:
                System.out.println("Четвертый пользователь");
                break;
        }
    }
}
