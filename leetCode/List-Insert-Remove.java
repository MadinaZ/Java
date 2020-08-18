package com.Madina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < input; i++)
        {
            int val = scanner.nextInt();
            list.add(val);
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            switch (scanner.next()) {
                case "Insert":
                    int index = scanner.nextInt();
                    int number = scanner.nextInt();
                    list.add(index, number);
                    break;
                case "Delete":
                    list.remove(scanner.nextInt());
            }

        }

        for(Integer e: list)
            System.out.print(e + " ");
    }
}
