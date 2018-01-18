package bankaccountapp;

public class Saving extends Account implements IRate {
	
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	public Saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber="1" + accountNumber;
		setSafetyDepositBox();
	}

	@Override
	public void setRate() {
		rate=getBaseRate() * .25;

	}

	private void setSafetyDepositBox(){
		safetyDepositBoxID= (int)(Math.random()* Math.pow(10,3));
		safetyDepositBoxKey=(int)(Math.random()* Math.pow(10,4));

	}

	public void showInfo(){
	    super.showInfo();
		System.out.println("Saving Accounts Features:"+
				"\nSafety Deposit Box ID:"+safetyDepositBoxID+
				"\nSafety Deposit Box Key:"+safetyDepositBoxKey);
		
	}





}
