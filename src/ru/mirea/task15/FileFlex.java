package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class FileFlex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try(FileWriter writer1 = new FileWriter("C:\\java\\task15.txt", false))
        {
            String text = input.nextLine();
            writer1.write(text);
            writer1.append('\n');
            writer1.flush();
        }
        catch(IOException ex) {System.out.println(ex.getMessage());}

        try(FileReader reader = new FileReader("C:\\java\\task15.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        try(FileWriter writer2 = new FileWriter("C:\\java\\task15.txt"))
        {
            String text = input.nextLine();
            writer2.write(text);
            writer2.append('\n');
            writer2.append("Man I Love Frogs");
            writer2.flush();
        }
        catch(IOException ex) {System.out.println(ex.getMessage());}
    }
}