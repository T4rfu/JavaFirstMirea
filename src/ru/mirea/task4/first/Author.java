package ru.mirea.task4.first;

import java.lang.*;
public class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String n, char g, String e)
    {name = n; email = e; gender = g;}
    public Author(String n, char g)
    {name = n; gender = g;}
    public String getName(String name)
    {return name;}
    public String getEmail(String email)
    {return email;}
    public char getGender(char gender)
    {return gender;}
    public void setEmail(String email)
    {this.email = email;}
    public String toString()
    {
        String sort;
        if (gender == 'F')
        {sort = "(ms)";}
        else
        {sort = "(m)";}
        return this.name+sort+" at "+email;
    }
}
