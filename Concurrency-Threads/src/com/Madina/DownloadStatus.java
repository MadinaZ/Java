package com.Madina;

public class DownloadStatus {

    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    //each thread increments by one
    public void incrementTotalBytes(){
        totalBytes++;
    }
}
