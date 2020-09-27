package com.Madina;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.deleteFirst();
        System.out.println(list.contains(20));
    }
}
