package ru.mirea.task26;

public class Administration {

    private BanStrategy banStrategy;

    public Administration(BanStrategy banStrategy){
        this.banStrategy =banStrategy;
    }

    public void ban() {
        this.banStrategy.ban();
    }

    public void mute() {
        System.out.println("Дать мут");
    }

    public void report() {
        System.out.println("Отправить сообщение на проверку");
    }

}

