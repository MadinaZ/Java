package com.Madina;

public class Cloud {
    private float bottom;
    private float top;


    public Cloud(float bottom, float top) {
        this.bottom = bottom;
        this.top = top;
    }

    public float getHeight(){
        return top - bottom;
    }

    public String rain(){
        return "It is raining";
    }
}
