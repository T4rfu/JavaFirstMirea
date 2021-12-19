package ru.mirea.task26;

public class Main {
    public static void main(String[] args) {

        Administration admin = new Admin();
        Administration assistant = new AdmAssistant();
        Administration intern = new Intern();

        admin.ban();
        assistant.ban();
        intern.ban();
    }
}
