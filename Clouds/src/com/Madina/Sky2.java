package com.Madina;

import java.util.ArrayList;
import java.util.Collection;

public class Sky2 extends ArrayList<Cloud> {

    public Sky2(){
        super();
    }

    public double getMeanHeight(){
        double average = this.stream()
                .mapToDouble(m -> m.getHeight()).average().orElse(0);
        return average;
    }
}
