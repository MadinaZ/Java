package com.Madina;

//we want this class to implement our Interface(TaxCalculator)
//as we can see class can extends from other classes and implement interface as well
//public class TaxCalculator2018 extends Object implements TaxCalculator {
public class TaxCalculator2018  implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    //even though if we don't put @Override method compiler won't complain
    //but it is a good practice to put @Override for interface methods
    @Override
    public double calculateTax(){
        return taxableIncome * 0.4;
    }
}
