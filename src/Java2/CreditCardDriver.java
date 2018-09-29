package Java2;

import java.util.Scanner;

public class CreditCardDriver
{
	public static void main(String[] args) 
	{
		CreditCards Jason = new CreditCards("Jason Snyder", 490);
		
		String ans = "y";
		
		Scanner scan = new Scanner(System.in);
		
		//Simulate 6 months of purchases and payments
		for(int month = 1; month <= 6; month++)
		{
			//Let user make as many purchases per month as he/she likes
			do
			{
				System.out.print("Would you like to make a purchase (y/n)? ");
				ans = scan.next();
				if(ans.equalsIgnoreCase("y"))
				{
					System.out.print("Enter the purchase amount: ");
					Jason.makePurchase(scan.nextDouble());
				}
			}while(ans.equalsIgnoreCase("y"));
			
			//Allow user to make a payment if the balance is greater than 0
			if(Jason.getBalance() > 0)
			{
				System.out.print("Would you like to make a payment (y/n)? ");
				ans = scan.next();
				if(ans.equalsIgnoreCase("y"))
				{
					System.out.print("Enter the payment amount: ");
					Jason.makePayment(scan.nextDouble());
				}
				//Raise the rate if the card holder misses a payment
				else
				{
					System.out.println("No payment made this month. Raising rate by 2%.");
					Jason.raiseRate(2);
				}
			}
			
			//Recalculate balance at the end of each month
			Jason.calculateBalance();
			
			System.out.println();
			System.out.println("End of month " + month + ":");
			System.out.println(Jason);
		}
	}
}
			
