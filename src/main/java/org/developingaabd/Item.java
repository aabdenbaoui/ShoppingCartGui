package org.developingaabd;

public class Item {
    private String name;
    private double price;
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double priceFor(int quantity){
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format(name + ", $ %.2f", price);
    }
}
