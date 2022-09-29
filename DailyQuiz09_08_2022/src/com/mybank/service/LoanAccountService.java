package com.mybank.service;

public class LoanAccountService {
 //private int loanId,loanAmount, rateOfInterest,period; 
 public double calculateInterest(int id, int amount, int roi, int tenure) {
	   double interest = (amount*tenure*roi)/100;
	   return interest;
   }
   
   
}