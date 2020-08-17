package com.Madina;

public class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadStatus getStatus() {
        return status;
    }

    public DownloadFileTask(){
        this.status = new DownloadStatus();
    }

//    public DownloadFileTask(DownloadStatus status) {
//        this.status = status;//to create such field Alt+enter
//    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

//        try {
//            Thread.sleep(5000); //in milliseconds (interval of execution is gonna be 5sec)
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for(var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) break;
            status.incrementTotalBytes();
        }


        System.out.println("Download complete: "+ Thread.currentThread().getName());
    }
}
