package com.Madina;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        try {
            var reader = new FileReader("File.txt");
            var value =reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException | ParseException e){
            System.out.println("Could not read the data");
        }
//        catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}
