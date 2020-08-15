package com.Madina;

import com.Madina.collections.Customer;
import com.Madina.collections.EmailComparator;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

    /*
    public static void main(String[] args) {
////        new GenericList<Integer>().add(1);
//        let's store it in var
//        var list = new GenericList<User>();
//        list.add(new User());
//        User user = list.get(0);
//
//        GenericList<Integer> numbers = new GenericList<>();

//        new GenericList<User>();

        var user1 = new User(10);
        var user2 = new User(20);
        if(user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");
        else if(user1.compareTo(user2) == 0)
            System.out.println("user1 = user2");
        else
            System.out.println("user1 > user2");


       var max = Utils.max(new User(10), new User(20));
        System.out.println(max);

        Utils.print(1, "wazzup");

        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));

//        works fine, but if you replace it by 2
//        var users = new GenericList<User>();
//        Utils.printUsers(users);

        //2
        //comp error bc GenericList<Instructor> is not subtype of GenericList<User>
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(new GenericList<Instructor>());
    }
     */

    //------------------
    //ITERABLE
    /*
    public static void main(String[] args) {
    var list = new GenericList<String>();
    list.add("a");
    list.add("b");
    //the problem w this impl is that we exposed the internal impl of this class to outside
//    for(var item: list.items)
//        System.out.println(item);

    //ex-2
//    var iterator = list.iterator();
//    while(iterator.hasNext()){
//        var current = iterator.next();
//        System.out.println(current);
//    }

        //ex-3
        for (var item: list){
            System.out.println(item);
        }
    }
     */


    //COLLECTIONS
//    public static void main(String[] args){
//        CollectionsDemo.show();
//    }

    //LIST
//        public static void main(String[] args){
//        ListDemo.show();
//    }

    //8-Comparison
    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
