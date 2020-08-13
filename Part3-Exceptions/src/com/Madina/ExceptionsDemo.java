package com.Madina;

import exceptions.Account;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
//        FileReader reader = null;
//        try (
//                var reader = new FileReader();
//                var writter = new FileWriter("...");
//        ){ //try-with-resources statement (will add finally code)
////            var reader = new FileReader("File.txt");
//            var value =reader.read();
//            new SimpleDateFormat().parse("");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException | ParseException e){
//            System.out.println("Could not read the data");
//        }


        var account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
