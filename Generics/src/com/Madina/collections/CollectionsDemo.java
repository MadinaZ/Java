package com.Madina.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
//    for(var item: collection)
//        System.out.println(item);

        //to print collection as a whole
        System.out.println(collection);

        //to add additional items to our collection
        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection);
        System.out.println(collection.size());
        collection.remove("a");
        System.out.println(collection);

        collection.clear();
        System.out.println(collection.isEmpty());

        var containsA = collection.contains("a");
        System.out.println(containsA);
    }
}
