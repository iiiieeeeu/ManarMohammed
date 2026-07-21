package models;
public class Service {
    private String Name;
    private double Price;

    public Service(String name, double price) {
        this.Name = name;
        this.Price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }
}
