package ATMmachine;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	int selection;

	Scanner menuInput=new Scanner(System.in);
		DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
		
		HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
		
		/* validate login information customer number and pin number */
		public void getLogin() throws IOException {
			int x=1;
			do {
				try {
				data.put(9584, 12345);
				data.put(987654321, 55555);
				System.out.println("welcome to the ATM project !");
				System.out.print("Enter your Customer number:");
				setCustomerNumber(menuInput.nextInt());
				System.out.print("Enter your pin number");
				setPinNumber(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("\n"+ "invalid character(s). only numbers."+ "\n");
				x=2;
			}
				for(Entry<Integer,Integer> entry: data.entrySet()) {
					if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
						getAccountType();
					}
				}
				System.out.println("\n"+ "wrong cutomer or pin Number "+"\n");
		}
			while(x==1);
		}
		
		/* Display Account type menu with Selection*/
		
		public void getAccountType() {
			System.out.println("select the Account you want to access");
			System.out.println("type1- checking account");
			System.out.println("type2- saving Account");
			System.out.println("Type3-Exit");
			System.out.print("Choice: ");
			selection=menuInput.nextInt();
			switch(selection) {
			case 1:
				getChecking();
				break;
			case 2:
				getSaving();
				break;
			case 3:
				System.out.println("thank you for using this ATM, bye");
				default :
					System.out.println("\n"+"Invalid choice." +"\n");
					getAccountType();
			}
		
	}
		/*Diplay checking Account menu with selection*/
		public void getChecking() {
			System.out.println("checking Account:");
			System.out.println("Type1-view Balance");
			System.out.println("Type2-withdraw funds");
			System.out.println("Type3: deposit funds");
			System.out.println("type4: Exit");
			System.out.print("choice:  ");
			selection=menuInput.nextInt();
			switch(selection) {
			case 1:
			System.out.println("checking Account Balance :" +moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("thank you for using this ATM, bye");
				break;
				default :
				System.out.println("\n"+ "Invalid choice."+"\n");
				getChecking();			
			}
			}
		/*Display saving Account Menu with solution*/
		public void getSaving() {
			System.out.println("checking Account:");
			System.out.println("Type1-view Balance");
			System.out.println("Type2-withdraw funds");
			System.out.println("Type3: deposit funds");
			System.out.println("type4: Exit");
			System.out.print("choice:  ");
			selection=menuInput.nextInt();
			switch(selection) {
			case 1:
				System.out.println("saving account Balance:" + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("thank you for using this ATM, bye");
				break;
				default:
					System.out.println("invalid choice. "+ "\n");
					getSaving();
					
			}
		}
			
	
	}
	
		


