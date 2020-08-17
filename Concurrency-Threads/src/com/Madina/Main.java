package com.Madina;

public class Main {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.show();
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());
        //2 (main thread(that runs our prg) and back thread(garbage)removes unused
        //8  (4 cores and 2 threads -> 8)
    }
}
