package ru.mirea.task28;

public class Main {

    public static void main(String[] args){

        Auto volvo = new Auto("940 ESTATE", 120);
        Auto.Handbrake VHandbrake = volvo.new Handbrake();
        Auto.Window VWindow = volvo.new Window();

        volvo.start();
        VHandbrake.letGoOfBrake();
        volvo.drift();
        volvo.stop();
        VHandbrake.putOnBrake();

        Auto toyota = new Auto("Mark II", 200){
            @Override
            public void drift(){
                System.out.println("Пошел навал боком");
            }
        };
        Auto.Handbrake THandbrake = toyota.new Handbrake();
        Auto.Window TWindow = toyota.new Window();

        toyota.start();
        THandbrake.letGoOfBrake();
        TWindow.windowDown();
        toyota.drift();
        toyota.reelUpToPillar();
    }
}
