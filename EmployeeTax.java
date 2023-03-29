package com.cognizant.tax;

public class EmployeeTax {
    public static void main(String[] args) {
        // Test Case 1
        TaxCalculator employee1 = new TaxCalculator(25000, true);
        employee1.calculateTax(); // The Tax of the employee  for  the   25000.0 is 7500.0
        employee1.deductTax(); // The nett salary of the employee 17500
        employee1.validateSalary(); // The salary and citizenship eligibility: false

        // Test Case 2
        TaxCalculator employee2 = new TaxCalculator(125000, true);
        employee2.calculateTax(); // The Tax of the employee  for  the   125000.0 is 37500.0
        employee2.deductTax(); // The nett salary of the employee 87500
        employee2.validateSalary(); // The salary and citizenship eligibility: true
    }
}
