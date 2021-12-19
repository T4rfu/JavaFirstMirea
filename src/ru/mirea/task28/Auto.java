package ru.mirea.task28;

public class Auto {
    private String model;
    private int speed;

    public Auto(String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    public void start(){
        System.out.println(model+" заведен");
    }

    public void stop(){
        System.out.println(model+" остановлен");
    }

    public void drift(){
        System.out.println("Дрифт - не безопасно");
    }

    public void reelUpToPillar(){
        System.out.println(model+" успешно намотан на столб");
    }

    public class Handbrake{
        public void letGoOfBrake(){
            System.out.println("Снят с ручника");
        }
        public void putOnBrake(){
            System.out.println("Поставлен на ручник");
        }
    }

    public class Window{
        public void windowUp(){
            System.out.println("Стекла подняты");
        }
        public void windowDown(){
            System.out.println("Стекла опущены");
        }
    }

}
