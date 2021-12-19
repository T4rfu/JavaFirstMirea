package ru.mirea.task26;

public class AdmAssistant extends Administration {
    public AdmAssistant() {
        super(new StandartBanStrategy());
    }
}
