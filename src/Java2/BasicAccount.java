package Java2;

	public class BasicAccount extends BankAccount{
		  private double balance;
          public BasicAccount() {
			  
		  }
		  public void deposit(double amount) {
			   balance=balance+amount;
		   }
		  public void withdraw(double amount) {
			 final int WITHDRAW_FEE=30; 
			 super.withdraw(amount);
			 double balance=getBalance();
			 if(balance<0) {
				 super.withdraw(WITHDRAW_FEE);
			 }
		  }
		  public void monthEnd() {
			   double balance=getBalance();
		   }
		  public double getBalance() {
			   return balance;
		   }
		  
	   }

