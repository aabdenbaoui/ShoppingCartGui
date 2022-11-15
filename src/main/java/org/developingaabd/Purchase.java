package org.developingaabd;

public class Purchase {
    private Item item;
    private int quantity;
    public Purchase(Item item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isEmpty(){
        return this.quantity == 0 ? true : false;
    }

    public boolean matches(Purchase purchase){
        return purchase.item.getName().equals(this.item.getName()) ? true : false;
    }

    public double getPrice() {
        return item.priceFor(quantity);
    }

    @Override
    public String toString() {
        return item.getName() + ":" + quantity;
    }
}
