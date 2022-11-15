package org.developingaabd;

public class DiscountedItem extends Item {
    private int bulkQuantity;
    private double bulkPrice;
    public DiscountedItem(String name, double price,int bulkQuantity, double bulkPrice){
        super(name, price);
        this.bulkPrice = bulkPrice;
        this.bulkQuantity = bulkQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + " (" +bulkQuantity + " for $" + bulkPrice + ")";
    }
}
