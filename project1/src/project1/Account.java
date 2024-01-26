package project1;

import java.text.DecimalFormat;
import java.util.*;

public class Account {
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	//set the customer number
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	// get cutsomer number
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	//set pin number
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	//get pin number
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	
	//get checking acc balance
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	//get saving acc balance
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//calculate cheking account withdraw
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
		
	}
	
	//claculate saving amount withdraw
	
	public double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	
	//claculate cehcking amt deposit
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	
	//calc saving amt deposit
	
	public double calcSavingDeposit(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	
	//customer withdraw amount input
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();

		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("saving amount balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account: ");
		double amount=input.nextDouble();
		
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("new Saving Account balance:"+moneyFormat.format(savingBalance)+ "\n");
		}
		else {
			System.out.println("Balance cannot be negatieve:"+"\n");
			
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("checking Account balance:"+moneyFormat.format(checkingBalance)+ "\n");
		System.out.println("Amount you want to deposit to checking Acount:");
		double amount=input.nextDouble();
		
		if((checkingBalance+amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking account balance:" +moneyFormat.format(checkingBalance)+"\n");
		}
		else {
			System.out.println("Balance cannot be nagatieve."+"\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving account balance is:"+moneyFormat.format(savingBalance)+"\n");
		System.out.println("amount you want to deposit into saving account:");
		double amount=input.nextDouble();
		
		if((savingBalance+amount)>=0) {
			calcSavingDeposit(amount);
			System.out.println("new saving account balance:"+moneyFormat.format(savingBalance)+"\n");
		}
		else {
			System.out.println("Blaance cannot be nagatieve."+"\n");
		}
	}
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;

}
