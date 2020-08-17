package com.Madina;

import java.util.ArrayList;

public class Sky {

    private ArrayList<Cloud> clouds;

    public Sky(){
        clouds = new ArrayList<Cloud>(100);
    }

    public boolean add(Cloud c){
        clouds.add(c);
        return true;
    }

    public double getMeanHeight(){
        double average = clouds.stream()
                .mapToDouble(m -> m.getHeight()).average().orElse(0);
        return average;
    }

//    public float getMeanHeight(){
//        float sum = 0;
//        for(Cloud c: clouds)
//            sum += c.getHeight();
//        return sum/clouds.size();
//    }

}
