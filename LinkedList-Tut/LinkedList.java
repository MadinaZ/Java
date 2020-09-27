package com.Madina;

public class LinkedList {
    //we are adding this class inside of the LL bc Node class is part of implementation of LL
    //like when we have used dot operator LL took care of everything under the hood.
    private class Node {//declared as private bc nowhere in the program it should be accessed except this one

        private int value;
        private Node next;

//        public Node(int value) {
//            this.value = value;
//        }
    }


    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node();//1) create
        node.value = item; //we could not access it before bc it was private
        //or we can create a constructor instead of |^

        if(first == null)//or we can use func isEmpty implemented below
            first = last = node; //setting first and last node to the newly created Node
        else{
            last.next = node;// adding Node after the lastNode
            last = node;
        }
    }

    public void addFirst(int item){
        var newNode = new Node(); //1)create
//        var newNode = new Node(item); //1)create
        newNode.value = item; //no need since assign it via constructor
        if(isEmpty())
            first = last = newNode;
        else{
            newNode.next = first;
            first = newNode;
        }
    }

    private boolean isEmpty(){
        return first == null;
    }

    public void deleteFirst(){
        //[10 {->} 20 -> 30]
        var secondRef = first.next;
        first.next = null; //will remove the link in{}
        first = secondRef;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first; //used to traverse the LL
        while(current != null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        //instead we can do this:
        return indexOf(item) != -1;
//        var current = first;
//        while(current != null){
//            if(current.value == item)
//                return true;
//            current = current.next;
//        }
//       return false;
    }

    public void removeLast() {
        if(isEmpty())
            return;
        //we have to have at least two nodes
        if(first == last)
            return;

        var previous = getPrevious(last);
        //removing the link so garbage collector can remove it from the memory
        last = previous;
        last.next = null;//deleting*
    }

    public Node getPrevious(Node node){
        var current = first;
        while (current != null) {
            if (current.next == last)
                return current;
            current = current.next;
        }
        return null;
    }
}
