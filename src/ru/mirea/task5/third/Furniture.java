package ru.mirea.task5.third;

public abstract class Furniture
{
    protected int price;
    protected double area;
    protected String material;
    protected String color;
    protected int quality;
    protected String type;

    public Furniture(int price, double area, String material, String color, int quality)
    {
        this.price = price;
        this.area = area;
        this.material = material;
        this.color = color;
        this.quality = quality;
    }

    public double getArea() {return area;}
    public int getPrice() {return price;}
    public String getColor() {return color;}
    public String getMaterial() {return material;}
    public int getQuality() {return quality;}
    public void setArea(double area) {this.area = area;}
    public void setColor(String color) {this.color = color;}
    public void setMaterial(String material) {this.material = material;}
    public void setPrice(int price) {this.price = price;}
    public void setQuality(int quality) {this.quality = quality;}

    abstract public String toString();
}
