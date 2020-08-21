import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(x/y);
        }
        catch (ArithmeticException | InputMismatchException e){
            if(e instanceof ArithmeticException)
                System.out.println(e.getClass().getName() + ": / by zero");
            else if( e instanceof InputMismatchException){
//                System.out.println(e);
                System.out.println(e.getClass().getName());
            }
        }
    }
}
