package com.Madina;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){

        System.out.println(Thread.currentThread().getName());

//        for(var i = 0; i < 10; i++){
            //creating new threads
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();//to start this thread


//            try {
//                thread.join();//will wait for the completion of the download thread
//                //(will block the current thread until the thread is finished)
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        //only once the method returns, we can print the following message
//            System.out.println("File is ready to be scanned");
//        }



//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //to cancel downloading after 1 sec
//        thread.interrupt();//however it doesn't force out DownloadFileTask to stop
//        //that's why we have to check for interrupt request in our DownloadFileTask file


        //RACE CONDITIONS
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();


        //here we are starting 10 download threads
        for(var i = 0; i < 10; i++){
            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for(var thread: threads)
        {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        var total = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(Integer::sum); //(0, (a, b) -> (a+b)

        System.out.println(total);
//        //here we get difference nums bc threads are competing
//        System.out.println(status.getTotalBytes());

    }
}
