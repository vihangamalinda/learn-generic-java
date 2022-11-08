package com.vihanga.generics.box;

import java.util.ArrayList;

public class TestBoxGeneric {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Vihanga","Malinda", 0.8));
        bookBox.addItem(new Book("Vihanga Chapter 2","Malinda", 1.8));
        System.out.println(bookBox.latestItemsFromBox());
        System.out.println(BoxUtils.countBoxItems(bookBox));
        System.out.println(bookBox);
        System.out.println("Box Weight: "+bookBox.totalWeight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango","Srilanka","Yellow",0.5));
        fruitBox.addItem(new Fruit("Banana","Malayasia","Green",0.2));
        System.out.println(fruitBox.latestItemsFromBox());
        System.out.println(BoxUtils.countBoxItems(fruitBox));
        System.out.println(fruitBox);
        System.out.println("Box Weight: "+fruitBox.totalWeight());

    }

}
