package ru.mirea.task20;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.util.Scanner;

public class TimeClass {
    Date date = new Date();
    Date dt_to = null;
    TimeZone tempZone = TimeZone.getDefault();
    TimeZone[] idTimeZone = {TimeZone.getTimeZone("Europe/Moscow"), TimeZone.getTimeZone("America/Argentina/Buenos_Aires"), TimeZone.getTimeZone("Israel")};
    DateFormat df_to = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void timeMessageSent(int id)
    {
        df_to.setTimeZone(idTimeZone[id]);
        String date_to = df_to.format(date);
        System.out.println("Сообщение было получено в "+date_to+" ("+idTimeZone[id].getID()+")");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TimeClass test = new TimeClass();
        System.out.println("Выберите ID получателя: ");
        test.timeMessageSent(sc.nextInt());
    }
}
