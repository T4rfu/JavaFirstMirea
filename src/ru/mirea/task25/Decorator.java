package ru.mirea.task25;

public class Decorator implements Service {
    private Service service;
    private String label;
    private double price;

    public Decorator(Service service, String label, double price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price + service.getPrice();
    }

    public String getLabel() {
        return this.label + service.getLabel();
    }
}