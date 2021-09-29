package ru.mirea.task2.third;


import java.lang.*;
public class BookOne {
    private String bookName;
    private int pages;

    public BookOne(String n, int a)
    {bookName = n; pages = a;}
    public BookOne(String n)
    {bookName = n; pages = 2;}
    public BookOne()
    {bookName = "Plague"; pages = 2;}
    public void setBookName(String bookName)
    {this.bookName = bookName;}
    public void setPages(int pages)
    {this.pages = pages;}
    public String getBookName(String bookName)
    {return bookName;}
    public int getPages(int pages)
    {return pages;}
    public String toString()
    {return this.bookName+" - amount of pages: "+this.pages;}
    public void timeOfReading()
    {System.out.println("It will take you "+pages*3+" minutes to read "+bookName);}
}

