import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
                String s = scan.nextLine();
        if(s.trim().length() == 0 || s.trim().length() > 400_000)
            System.out.println(0);

        else if(s.length() > 0){
            String[] str = s.trim().split("['!?,._@\\s]+");

            System.out.println(str.length);
            for(String l : str)
                System.out.println(l);
        }

        scan.close();
    }
}
