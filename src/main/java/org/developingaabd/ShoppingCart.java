package org.developingaabd;

import java.util.*;

public class ShoppingCart {
//    private double total;
    Set<Purchase> purchases = new HashSet<>();
    private double total;

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
       return calculateTotal();
    }
    private double calculateTotal(){
        total = 0;
        for(Purchase purchase : purchases){
            total += purchase.getPrice();
        }
        return total;
    }
    public boolean hasDiscount() {
        int totalItems = 0;
        for(Purchase purchase : purchases){
            totalItems += purchase.getQuantity();
        }
        if(totalItems >= 20){
            return true;
        }else{
            return false;
        }
    }

    public void setDiscount(boolean selected){
        System.out.println("before: " + total);
        System.out.println(hasDiscount());
        if(selected && hasDiscount()){
              total -=  total * 0.1;
        }
        System.out.println("after" + total);
    }
}
