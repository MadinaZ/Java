package com.Madina.generics;

import java.util.Iterator;

//this T is now bounded type parameter. It's restricted
public class GenericList<T> implements  Iterable{ //& is not a logical "and" operator
    //line below SHOULD be private, so if T[] is replaced by other DS the main won't be affected
    public T[] items = (T[]) new Object[10]; //since here we don't know the type yet(haven't instantiated in main)
    //we are casting it by (T[])
    public int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get (int index){
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(this); //here we have to pass GenericList which is equal to -> this
    }

    //since the return type of iterator is Iterator we have to implement two required funcs
    private class ListIterator implements Iterator<T>{


        //since we wanna iterate over the genlist we should pass it via constructor
        private GenericList<T> list;
        private int index;


        public ListIterator(GenericList<T> list){
            this.list = list;

        }
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
