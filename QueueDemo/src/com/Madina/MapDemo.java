package com.Madina;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();//key is a key and value is a customer
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var unknown = new Customer("Unknown", "");
        var customer = map.get("e1");

        //in case if we wanna return smth instead of obj that doesn't exist we can do:
//        var customer = map.getOrDefault("e10", unknown);

        //to check if it exists
//        var exists = map.containsKey("e10");
//        System.out.println(exists);

        //to replace the key
//        map.replace("e1", new Customer("a++", "e1"));
//        System.out.println(map);

        //Since map are not iterable
//        for(var key: map.keySet())
//            System.out.println(key); //prints all keys

//        for(var entry: map.entrySet())
//            System.out.println(entry); //e1=a, e2=b
////            System.out.println(entry.getValue()); //getKey()

        for(var customer2: map.values())//ORDER IS NOT GUARANTEED
            System.out.println(customer2);//here in each iteration we get one customer


        System.out.println(customer);
    }
}
