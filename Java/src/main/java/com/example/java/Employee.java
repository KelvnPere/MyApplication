package com.example.java;

// Extend Key word is what helps us to inherit from Person Class
public class Employee extends Person {

    private int id;
    private double annualSalary;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
