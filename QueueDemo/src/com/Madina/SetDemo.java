package com.Madina;

import java.lang.reflect.Array;
import java.util.*;

public class SetDemo {
    public static void show(){
//        Set<String> set = new HashSet<>();
//        set.add("Sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        System.out.println(set);

        //2
//        //we can preserve the order by doing this:
//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);

        //Faster way of creating List of Strings
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("d", "b", "c"));

//        set1.addAll(set2);
//        System.out.println(set1);

        //Intersection
//        set1.retainAll(set2);
//        System.out.println(set1);

        //Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
