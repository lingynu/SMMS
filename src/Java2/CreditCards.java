package Java2;
import java.text.NumberFormat;
import java.util.Locale;

public class CreditCards {
	private static final double baseRate = 5.5;
	private static int lastAccountNumber = 1234567;
	
	private String accountHolder;
	private int accountNumber;
	private int creditScore;
	private double rate;
	private double balance;
	private int creditLimit;
	
	private static NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
	
	public CreditCards (String newAccountHolder, int newCreditScore)
	{
		accountHolder = newAccountHolder;
		creditScore = newCreditScore;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber++;
		balance = 0;
		determineRateAndLimit(newCreditScore);
	}
	
	private void determineRateAndLimit(int newCreditScore)
	{
		if(creditScore < 300)
		{
			rate = baseRate + 10;
			creditLimit = 1000;
		}
		else if(creditScore < 500)
		{
			rate = baseRate + 7;
			creditLimit = 3000;
		}
		else if(creditScore < 700)
		{
			rate = baseRate + 4;
			creditLimit = 7000;
		}
		else
		{
			rate = baseRate + 1;
			creditLimit = 15000;
		}
	}
	
	public void makePurchase(double amount)
	{
		if(balance + amount > creditLimit)
			System.out.println("Purchase Declined: Not Enough Credit.");
		else
			balance += amount;
	}
	

	public void makePayment(double payment)
	{
		if(payment < .1 * balance)
		{
			System.out.println("Payment is less than minimum balance. Raising rate.");
			raiseRate(1);
		}
		
		if(balance - payment <= 0)
		{
			if(balance - payment < 0)
				System.out.println("Payment is greater than balance. Refunding difference...");
			balance = 0;
			creditScore += 10;
			determineRateAndLimit(creditScore);
		}
		else
			balance -= payment;
	}
	
	public double getBalance() 
	{
	    return balance;
	}

	public void raiseRate(int rateRaise)
	{
		rate += rateRaise;
	}
	

	public void calculateBalance()
	{
		balance += (balance * ((rate / 100) / 12));
	}
	
	public String toString()
	{
		String result = "";
		result += ("Account Holder Name: " + accountHolder + "\n");
		result += ("Account #: ****" + accountNumber % 1000 + "\n");
		result += ("Balance: " + fmt.format(balance) + "\n");
		result += ("Limit: " + fmt.format(creditLimit) + "\n");
		
		return result;
	}
}
