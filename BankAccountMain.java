package com.blc.elc;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount bc=new BankAccount();
		bc.setAccountDetails("Rahul",123456,5000.0);
		String result=bc.getAccountDetails();
		System.out.println(result);

	}

}
