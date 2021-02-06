package ATMmachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
	Scanner input =new Scanner (System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,#0.00");

	/*  get customer number */
	public int getCustomerNumber() {
		return customerNumber;
	}
	/*  set customer number */
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	/*  get pin number */
	public int getPinNumber() {
		return pinNumber;
	}
	/* set pin number */
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	/* get checking balance*/
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	/*  get saving balance */
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	/*  calculate checking account withdrawal*/
	public double calcCheckingWithdraw(double amount) {
		checkingBalance= (checkingBalance - amount ) ;
		return checkingBalance;
	}
	/*  calculate saving account withdrawal*/
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	/*calculate checking Account deposit */
	public double calcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance + amount);
		return checkingBalance;
	}
	/*  calculate saving account deposit*/
	public double calcSavingDeposit(double amount) {
		savingBalance =(savingBalance + amount);
		return savingBalance;
	}
	/* customer checking account withdraw input*/
	public void getCheckingWithdrawInput() {
		System.out.println("checking account balance:"+ moneyFormat.format(checkingBalance));
		System.out.print("amount you want to withdraw form checking account: ");
		double amount = input.nextDouble();
		if(checkingBalance-amount>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("new checking account bakance:"+ moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("Balance canot be negative"+ "\n");
		}
		}
	/* customer saving account withdraw input */
	public void getSavingWithdrawInput() {
		System.out.println("saving account bALANCE :"+ moneyFormat.format(savingBalance));
		System.out.print("amount you want to withdraw form saving account: ");
		double amount =input.nextDouble();
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("new saving account balance:"+ savingBalance+ "\n");
		}else {
			System.out.println("balance canot be negative"+ "\n");
		}
	}
	/*  customer checking account deposit input*/
	public void getCheckingDepositInput() {
		System.out.println("checking account balance :"+ moneyFormat.format(checkingBalance));
		System.out.print("amount you want to deposit from checking account");
		double amount = input.nextDouble();
		if((checkingBalance+ amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("new checking account balance:"+ moneyFormat.format(checkingBalance));
			
		}else {
			System.out.println("balance can not be negative"+ "\n");
		}
	}
	/* customer saving Account deposit input*/
	public void getSavingDepositInput() {
		System.out.println("saving account balance "+ moneyFormat.format(savingBalance));
		System.out.print("amount you want to deposit from saving account:");
		double amount=input.nextDouble();
		if((savingBalance + amount>=0)) {
			calcSavingDeposit(amount);
			System.out.println("new saving Account balance:"+moneyFormat.format(savingBalance));
		}else {
			System.out.println("balance can not be negative."+ "\n");
		}
	}
     }
	

