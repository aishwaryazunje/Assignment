package com.cognizant.tax;

public class TaxCalculator {
    private float basicSalary;
    private boolean citizenship;

    // constructor
    public TaxCalculator(float basicSalary, boolean citizenship) {
        this.basicSalary = basicSalary;
        this.citizenship = citizenship;
    }

    // methods for tax calculation and deduction
    // method for calculating tax
    public void calculateTax() {
        float tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee  for  the   " + basicSalary + " is " + tax);
    }

    // method for deducting tax from basic salary
    public void deductTax() {
        int nettSalary = (int) (basicSalary - (30 * basicSalary / 100));
        System.out.println("The nett salary of the employee " + nettSalary);
    }

    // method for validating salary and citizenship
    public void validateSalary() {
        boolean response = (basicSalary > 100000 && citizenship == true) ? true : false;
        System.out.println("The salary and citizenship eligibility: " + response);
    }
}
