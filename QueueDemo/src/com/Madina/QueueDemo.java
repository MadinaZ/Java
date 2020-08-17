package com.Madina;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        //b -> a -> c
        var front = queue.peek(); //c
        //equiv to peek is queue.element(); the diff is el throws an exception while peek rets null
        System.out.println(front);

        var front2 = queue.remove();//remove the item in the front //equiv to poll
        System.out.println(queue); //c is gone

    }

}
