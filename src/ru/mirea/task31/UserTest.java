package ru.mirea.task31;

import org.junit.Assert;
import ru.mirea.task30.User;

import java.util.ArrayList;
import java.util.List;

import java.io.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void getAllUsers() {
        ru.mirea.task30.User user0 = new ru.mirea.task30.User("Billy", 49);
        ru.mirea.task30.User user1 = new ru.mirea.task30.User("Van", 44);
        ru.mirea.task30.User user2 = new ru.mirea.task30.User("Rick", 39);

        List<ru.mirea.task30.User> expected = ru.mirea.task30.User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user0);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);

        /*Assert Equals
If you want to test equality of two objects, you have the following methods
assertEquals(expected, actual)
It will return true if: expected.equals( actual ) returns true.*/

        if(expected.equals( actual ))
        {
            try(FileWriter writer = new FileWriter("src/ru/mirea/task31/output.md"))
            {
                writer.write("noice");
                writer.flush();
            }
            catch(IOException ex) {System.out.println(ex.getMessage());}
        }
        else
        {
            try(FileWriter writer = new FileWriter("src/ru/mirea/task31/output.md"))
            {
                writer.write("not noice");
                writer.flush();
            }
            catch(IOException ex) {System.out.println(ex.getMessage());}
        }




    }
}
