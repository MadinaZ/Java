package com.Madina;

class Employee{
 private int baseSalary; //instance
 private int hourlyRate; //instance
 public static int numberOfEmployess;

 public Employee(int baseSalary, int hourlyRate){
     setBaseSalary(baseSalary);
     setHourlyRate(hourlyRate);
 }

 public static void printNumOfEmp(){
        System.out.println(numberOfEmployess);
        new Employee().calculateWage();
    }

 public void setBaseSalary(int baseSalary)
 {
     if(baseSalary <= 0)
         throw new IllegalArgumentException("Can't be 0 or less");
     this.baseSalary = baseSalary;
 }

 public int calculateWage(int extraHours){
    return baseSalary + (getHourlyRate() * extraHours);
    }
    public int calculateWage(){
    return calculateWage(0);
    }


    public int getBaseSalary(){return baseSalary;}

    public int getHourlyRate(){return hourlyRate;}

    public void setHourlyRate(int hourlyRate){
     if(hourlyRate < 0)
         throw new IllegalArgumentException("Hourly rate can't be 0 or less");
     this.hourlyRate = hourlyRate;
    }

}

public class Main {

//    public static void main(String[] args) {
//    var employee = new Employee();
//    employee.setBaseSalary(50_000);
//        System.out.println(employee.getBaseSalary());
//    employee.setHourlyRate(20);
//    }

//    public static void main(String[] args){
//        var browser = new Browser();
//        browser.navigate();
//    }
}
