package com.Madina.generics;


//we can declare a generic method inside a non generic class
public class Utils {
    public static<T extends Comparable<T>> T max(T first, T second){
        //Note that we cannot apply comparison operator to objects
//Wrong        return (first < second) ? first : second;
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K, V> void print(K key, V value){
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user){
        System.out.println(user);
    }

    //for printing a list of users
    //class CAP#1 {} extends User{}
    //class Instructor extends User{}
    //by extending it we restrict it, so no int or strings can be passed
    public static void printUsers(GenericList<? extends User> users){
        User x = users.get(0);//returns instance of the capture class
//        Instructor x = users.get(0);//returns instance of the capture class
        //comp err -> bc Instructor and CAP are two diff types. It's like assigning int to String
//        users.add();
    }
}
