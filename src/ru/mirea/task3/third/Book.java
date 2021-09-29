package ru.mirea.task3.third;

import java.lang.*;
public class Book {
    private String author;
    private String bookName;
    private int pages;
    private int year;

    public Book(String n, String au, int a, int y)
    {bookName = n; author = au; pages = a; year = y;}

    public Book()
    {bookName = "Plague"; author = "Bulgakov"; year = 1940; pages = 2;}

    public void setBookName(String bookName)
    {this.bookName = bookName;}
    public String getBookName(String bookName)
    {return bookName;}
    public void setPages(int pages)
    {this.pages = pages;}
    public int getPages(int pages)
    {return pages;}
    public void setYear(int year)
    {this.year = year;}
    public int getYear(int year)
    {return year;}
    public void setAuthor(String author)
    {this.author = author;}
    public String getAuthor(String author)
    {return author;}
    public String toString()
    {return this.bookName+" - amount of pages: "+this.pages+". Written by "+author+" in "+year;}
    public void timeOfReading()
    {System.out.println("It will take you "+pages*3+" minutes to read "+bookName);}
}
