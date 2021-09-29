package ru.mirea.task5.third;
import java.util.Scanner;

public class FurnitureShop
{
    public static void  main(String[] args)
    {
        int money = 300;
        Scanner sc = new Scanner(System.in);

        System.out.println("\t"+"Добро пожаловать в магазин! ");
        System.out.println("Ваш баланс: "+money);
        while(money>0) {
            if (money > 0) {
                System.out.println("Выберете товар: шкаф(1), стул(2), диван(3)");
                int choice = sc.nextInt();
                switch (choice) {
                    case(1):
                    {

                        Furniture w1 = new Wardrobe(100,3,"wood","w",30,70);
                        w1.quality = (30 + (int)(Math.random() * ((100 - 30) + 1)));
                        System.out.println("Выберите цвет: ");
                        String colour = sc.next();
                        w1.color = colour;
                        System.out.println("\t"+"Получите!");
                        System.out.println(w1);

                        System.out.println("Приобрести? (y = 1/n = 0)");
                        int ch = sc.nextInt();
                                if (ch == 1&&money >= w1.price)
                                    {money -= w1.price;
                                        System.out.println("Поздравляю с покупкой! Ваш баланс: "+money+"\n");
                                        break;}
                                else
                                    {System.out.println("Не удалось приобрести...");
                                        break;}
                    }
                    case(2):
                    {
                        Furniture c1 = new Chair(50,1,"plastic","w",1,"Gaming ");
                        c1.quality = (30 + (int)(Math.random() * ((100 - 30) + 1)));
                        System.out.println("Выберите цвет: ");
                        String colour = sc.next();
                        c1.color = colour;
                        System.out.println("\t"+"Получите!");
                        System.out.println(c1);

                        System.out.println("Приобрести? (y = 1/n = 0)");
                        int ch = sc.nextInt();
                        if (ch == 1&&money>=c1.price)
                        {money -= c1.price;
                            System.out.println("Поздравляю с покупкой! Ваш баланс: "+money+"\n");
                            break;}
                        else
                            {System.out.println("Не удалось приобрести...");
                            break;}
                    }
                    case(3):
                    {
                        Furniture s1 = new Sofa(150,2.5,"leather","w",2,2);
                        s1.quality = (30 + (int)(Math.random() * ((100 - 30) + 1)));
                        System.out.println("Выберите цвет: ");
                        String colour = sc.next();
                        s1.color = colour;
                        System.out.println("\t"+"Получите!");
                        System.out.println(s1);

                        System.out.println("Приобрести? (y = 1/n = 0)");
                        int ch = sc.nextInt();
                        if (ch == 1&&money>=s1.price)
                        {money -= s1.price;
                            System.out.println("Поздравляю с покупкой! Ваш баланс: "+money+"\n");
                            break;}
                        else
                        {System.out.println("Не удалось приобрести...");
                            break;}
                    }
                    default:
                        break;
                }
            }
            else
                break;
        }
    }
}
