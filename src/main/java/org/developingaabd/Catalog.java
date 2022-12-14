package org.developingaabd;

import java.util.*;

public class Catalog implements Iterable<Item> {
    List<Item> items = new ArrayList<>();
    private String storeName;

    public Catalog(String storeName){
        this.storeName = storeName;
    }
    public void add(Item item){
        items.add(item);
    }

    @Override
    public Iterator<Item> iterator() {
        return  items.iterator();
    }

    public String getStoreName() {
        return storeName;
    }
    public Item getItem(String name){
        int index = 0;
//        return items.get(name);
        for(Item tempItem : items){
            if(tempItem.getName().equals(name)){
                index = items.indexOf(tempItem);
            }
        }
        return items.get(index);
    }
}
