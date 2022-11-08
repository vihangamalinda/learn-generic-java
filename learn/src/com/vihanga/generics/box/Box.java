package com.vihanga.generics.box;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addItem(T t){
        this.items.add(t);
    }

    public T latestItemsFromBox(){
        return this.items.get(this.items.size()-1);
    }

    public List<T> getItems() {
        return items;
    }

    public double totalWeight(){
        return this.items.stream().mapToDouble(item -> item.getWeight()).sum();
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
