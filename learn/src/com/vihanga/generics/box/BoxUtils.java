package com.vihanga.generics.box;

public class BoxUtils {

    public static <T extends Boxable> int countBoxItems(Box<T> t){
        return t.getItems().size();

    }
}
