package com.mylearning.org;

public class Bank implements BankAccountOperations {

	public static void main(String[] args) {
		
		BankAccountOperations bc= new Bank();
		
		bc.greeting();
		bc.deposit(1000);
	}

	@Override
	public void greeting() {

		System.out.println("welcome to our Bank");
	}

	@Override
	public long deposit(int a) {
		
		System.out.println("My deposit amount:"+a);
		
		
		return 0;
	}

	@Override
	public long withdrawl(int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
