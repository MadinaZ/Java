package com.Madina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //constructor injection
        var calculator = new TaxCalculator2018(100_000);
//        var report = new TaxReport(calculator);
//        report.show();

        //setter injection
//        report.setCalculator(new TaxCalculator2019());
//        report.show();

        //method injection
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019());
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter cone radius: ");
//        double radius = scanner.nextDouble();
//        System.out.print("Enter cone radius: ");
//        double height = scanner.nextDouble();
//        IceCream ice = new IceCream(radius, height);
//
//        System.out.printf("Area: ", ice.getArea());
//        System.out.printf("Surface Area: %.2f", ice.getArea());

}
