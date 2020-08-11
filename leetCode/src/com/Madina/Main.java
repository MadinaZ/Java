package com.Madina;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
//    public:
    int reverse(int x) {
        String str = Integer.toString(x);
        String str2 = "";
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i + 1; j < str.length(); j++)
            {
                if(str[i].compareTo(str[j]))
                    str2 += str[i];
                else{
                    String temp = str[j];
                    str2 += temp;
                }

            }
        }
        int reverse = Integer.parseInt(str2);
        return reverse;

    }

};

public class Main {

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.reverse(1234));
    }
}
