package bankaccountapp;

public interface IRate {

	public default double getBaseRate(){
		
		return 2.5;
	}
	
	
}
