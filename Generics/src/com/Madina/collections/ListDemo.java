package com.Madina.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");
        System.out.println(list);
    }
}
