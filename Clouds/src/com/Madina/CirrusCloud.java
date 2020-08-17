package com.Madina;

public class CirrusCloud extends Cloud{

    public CirrusCloud(float bottom, float top) {
        super(bottom, top);
    }

    @Override
    public String rain() {
        return "I cannot make rain";
    }
}
