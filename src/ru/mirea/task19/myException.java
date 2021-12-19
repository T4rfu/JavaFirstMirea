package ru.mirea.task19;

public class myException {
    static void throwOne() throws ArithmeticException {
        System.out.println("В теле метода throwOne()");
        throw new ArithmeticException("выход за границу");
    }
    public static void main(String[] args) {
        System.out.println("Условие x>100, при x=10");
        int x=10;
        if(x>100)
        {
            try {throwOne();}
            catch ( ArithmeticException e) {
                System.out.println("Перехвачено исключение: " + e);
            }
        }
        else
            System.out.println("все ОК");
        System.out.println("Условие y>100, при y=110");
        int y=110;
        if(y>100)
        {
            try {throwOne();}
            catch ( ArithmeticException e) {
                System.out.println("Перехвачено исключение: " + e);
            }
        }
        else
            System.out.println("все OK");

    }
}