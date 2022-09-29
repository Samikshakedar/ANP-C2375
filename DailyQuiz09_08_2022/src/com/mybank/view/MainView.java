package com.mybank.view;
import com.mybank.service.LoanAccountService;
public class MainView {
	
	
     public static void main(String[] args) {
    	 LoanAccountService loanAccServiceObj=new LoanAccountService();
    	 double interest=loanAccServiceObj.calculateInterest(1,1000,5, 2);
    	 System.out.println(interest);
    	
     }
    }