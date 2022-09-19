package org.practicaltest.question3.model;

public abstract class RBI {

	private String bankName;
	protected static int bankAccountNumber;
	protected static String bankBranchName;
	private String customerName;
	private int bankIFSCcode;
	
public abstract void displayInfo(); 
	
	public RBI(String bankName,int bankAccountNumber) {
		this.bankName=bankName;
		this.bankAccountNumber=bankAccountNumber;
	}

	public RBI(String bankBranchName, String customerName, int bankIFSCCode) {
		super();
		this.bankBranchName = bankBranchName;
		this.customerName = customerName;
		this.bankIFSCcode = bankIFSCCode;
	}
	protected void getInfo(String bankName,int bankAccountNumber) {
		
			System.out.println("SAMIKSHA");
		
	}
	protected void getInfo(String bankBranchName, String customerName, int bankIFSCCode) {
		System.out.println("KEDAR");
	}
}
