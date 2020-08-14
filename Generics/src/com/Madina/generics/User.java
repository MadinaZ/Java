package com.Madina.generics;

//always specify the generic type
public class User implements Comparable<User>{
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        //this < o -> -1
        //this == o -> 0
        //this > o -> 1
//        if (points < o.points)
//            return -1;
        //instead of doing if statements we can do this!
        return points - other.points;
    }

    @Override
    public String toString(){
        return "Points=" + points;
    }
}
