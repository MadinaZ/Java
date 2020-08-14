package com.Madina.generics;

//this T is now bounded type parameter. It's restricted
public class GenericList<T> { //& is not a logical "and" operator
    private T[] items = (T[]) new Object[10]; //since here we don't know the type yet(haven't instantiated in main)
    //we are casting it by (T[])
    public int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get (int index){
        return items[index];
    }
}
