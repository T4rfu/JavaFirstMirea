package ru.mirea.task25;

public class DiamondVip extends Decorator {
    public DiamondVip(Service service) {
        super(service, "Diamond boost", 1500);
    }
}