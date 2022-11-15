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
    public double priceFor(int quantity) {
        int remainder = 0;
        int hasLeft = 0;
        if(quantity >= bulkQuantity){
          hasLeft =  quantity / bulkQuantity;
          remainder = quantity % bulkQuantity;
            System.out.println("hasLeft: " + hasLeft);
            System.out.println("remainder: " + remainder);
          return (hasLeft * bulkPrice)+ super.priceFor(remainder);
        }else{
           return super.priceFor(quantity);
        }
    }


    @Override
    public String toString() {
        return super.toString() + " (" +bulkQuantity + " for $" + bulkPrice + ")";
    }
}
