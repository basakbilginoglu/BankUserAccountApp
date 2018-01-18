package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		List<Account>accounts=new LinkedList<Account>();
		String file= "C:\\Users\\user\\Downloads\\NewBankAccounts.csv";
		List<String[]>newAccounts=utilities.CSV.read(file);

		for(String[]newAccount:newAccounts){
			String name =newAccount[0];
			String sSN=newAccount[1];
			String accountType=newAccount[2];
			double initdeposit=Double.parseDouble(newAccount[3]);
			//System.out.println(name+" "+sSN+" "+accountType+" "+initdeposit);
			if (accountType.equals("Savings")){
				//System.out.println("Open a Saving Account");
				accounts.add(new Saving(name,sSN,initdeposit));
			}
			else if(accountType.equals("Checking")){
				//System.out.println("Open a Checking Accounts ");
				accounts.add(new Checking(name,sSN,initdeposit));
			}
			else {
				//System.out.println("Error Reading Account Type ");
			}
		}
		for (Account acc:accounts){
		   
			acc.showInfo();
			System.out.println("**************");
		}

	}
}