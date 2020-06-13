package com.example.java;

 public class Manager extends Employee {

//  Overriding the get salary method
  @Override
  public double getAnnualSalary() {
   return super.getAnnualSalary() + 1000;
  }

     @Override
     public int getId() {
         return super.getId() + 500;
     }

     @Override
     public String toString() {
         return this.getFirstName() + " ,"
                 + this.getId() + ", "
                 + this.getAnnualSalary();
     }
 }
