package com.banking.project;
import java.util.Scanner;

public class BankProjectSolution {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		// achiving the upcasting / abstract 

		Bank bank=new BankImpl(5000);

		while(true)
		{

			//menu driver 
			System.out.println("WELCOME TO CENTRAL BANK OF INDIA");
			System.out.println("1.Deposit Amount \n2.Withdraw Amount \n3.checkBalance \n4.EXIT");
			System.out.println("----------------------");
			System.out.println("ENTER THE CHOICE");
			int choice=scan.nextInt();

			switch (choice)
			{
			case 1:
				System.out.println("Enter the Amount to be Deposit:");
				int amountToDeposit=scan.nextInt();
				bank.deposit(amountToDeposit);       //  bank.deposite(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter the Amount to be Withdraw:");
				int amountToWithdraw=scan.nextInt();
				bank.deposit(amountToWithdraw);       //  bank.Withdraw(scan.nextInt());
				break;
			case 3:
				System.out.println("THE AVAILABLE BALANCE IS Rs:");
				bank.checkBalance();
				break;
			case 4:
				System.out.println("THANK YOU!");  
				System.exit(0);
				Default:
					System.out.println("INVAILD CHOICE");
			}

		}

	}

}
