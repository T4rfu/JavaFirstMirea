package ru.mirea.task6.first;

public class TestNameable
{
    public static void main(String[] args) {
        NameableAnimal animal = new NameableAnimal("Cat");
        String a = animal.getName();
        NameableCar car = new NameableCar("Shaha");
        String c = car.getName();
        NameablePlanet planet = new NameablePlanet("Earth");
        String p = planet.getName();

        System.out.println("Animal: "+a);
        System.out.println("Car: "+c);
        System.out.println("Planet: "+p);
    }
}
