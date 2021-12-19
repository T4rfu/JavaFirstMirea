package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void getAllUsers() {
        User user0 = new User("Billy", 49);
        User user1 = new User("Van", 44);
        User user2 = new User("Rick", 39);

        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user0);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }
}
