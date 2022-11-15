package org.developingaabd;

import java.util.*;

public class ShoppingCart {
    Set<Purchase> purchases = new HashSet<>();
    public ShoppingCart(){

    }

    public static String getDiscountPercentage() {
        return "10";
    }

    public static String getDiscountQuantity() {
        return "20";
    }

    public void add(Purchase purchase) {
         if(purchases.isEmpty()){
             purchases.add(purchase);
         }else{
             List<Purchase> tempPurchases = new ArrayList<>();
             //copy purchases to tempPurchases
             for(Purchase purchase1 : purchases){
                 tempPurchases.add(purchase1);
             }
             //iterate over tempPurchases
             for(Purchase tempP: tempPurchases){
                 if(tempP.matches(purchase)){
                     purchases.remove(tempP);
                     purchases.add(purchase);
                     //it exists here debug
                     return;
                 }
             }
             for(Purchase tempP: tempPurchases){
                 if(!tempP.matches(purchase)){
                     purchases.add(purchase);
                     return;
                 }
             }

         }

    }
    public void clearAll(){
        purchases.clear();
    }
    public double getTotal(){
        double total = 0;
        for(Purchase purchase : purchases){
            total += purchase.getPrice();
        }
        return total;
    }

    public boolean hasDiscount() {
        return false;
    }

    public void setDiscount(boolean selected) {
    }
}
