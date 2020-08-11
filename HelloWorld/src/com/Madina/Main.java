package com.Madina;

//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//}
//class DVDPlayer {
//    boolean canRecord = false;
//    void recordDVD() {
//        System.out.println("DVD recording");
//    }
//
//    void playDVD()
//    {
//        System.out.println("Play DVD");
//    }
//}
//
//class Main {
//    public static void main(String [] args) {
//        DVDPlayer d = new DVDPlayer();
//        d.canRecord = true;
//        d.playDVD();
//        if (d.canRecord == true) {
//            d.recordDVD();
//        }
//    }
//}

//import java.text.NumberFormat;
//import java.util.Scanner;
//
//
//class Main{
//    public static void main(String [] args)
//    {
//        final byte percent = 100;
//        final byte months = 12;
//        Scanner scanner = new Scanner(System.in);
//        int principal = 0;
//        float monthlyInterest = 0;
//        float annualInterest = 0;
//
//        while(true){
//            System.out.print("Principal: ");
//            principal =scanner.nextInt();
//            if(principal >= 1000 && principal <= 1000_000)
//                break;
//            System.out.print("Enter a num between 1K and 1M");
//        }
//
//        System.out.print("Annual Interest Rate: ");
//        while(true)
//        {
//            annualInterest = scanner.nextFloat();
//            monthlyInterest = annualInterest/months/percent;
//
//            if (annualInterest > 0 && annualInterest <= 10)
//                break;
//            System.out.println("Enter a num between 1-10");
//        }
//
//
//        System.out.print("Period (Years): ");
//        int years = scanner.nextInt();
//
//        int numberOfPayments = years * months;
//
//        double mortgage = principal
//                *(annualInterest*Math.pow(1 + monthlyInterest, numberOfPayments))
//                /(Math.pow(1+monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);
//    }
//}


//public class Main{
//    public static void main(String[] args){
//        System.out.println("Start");
////        printNum(4);
//        System.out.println("Middle");
//        System.out.println("Finish");
//    }
//
//    public static void printNum(int limit){
//        for(int i = 0; i < limit; i++)
//            System.out.println(i);
//    }
//}

//Part-2-3

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        var report = new PrintConsole(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}
