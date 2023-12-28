package com.banking.project;

public class BankImpl implements Bank
{
	int balance;

	BankImpl(int balance)
	{
		this.balance=balance;
	}

	@Override
	public void deposit(int amount)
	{
		System.out.println("Depositing the Rs:"+amount);
		balance=balance+amount;         // balance+=amount;
		System.out.println("Amount Depositing sucessfully");
		System.out.println();
		System.out.println("------------------------------------");
	}
	@Override
	public void withdraw(int amount)
	{
		if(amount <=balance)
		{
	
		System.out.println("WithDrawing the Rs:"+amount);
		balance-=amount;           // balance=balance-amount
		System.out.println("Amount WithDrawing Sucessfully");
		System.out.println();
		System.out.println("----------------------------------");
		}
		else {
			try
			{
			throw new InsufficientBalanceException("INSUFFICIENT BALANCE");
		}catch(Exception e)
			{
			System.out.println(e.getMessage());
			}
			}
		
	}
	@Override
	public void checkBalance()
	{
		System.out.println("Available Balance is Rs:"+balance);
		System.out.println();
		System.out.println("------------------------------------");

	}

}
