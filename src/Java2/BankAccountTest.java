package Java2;

import java.util.Scanner;


public class BankAccountTest {
	public static void main(String[] args) {
		   BasicAccount accounts=new BasicAccount();
		   Scanner in=new Scanner(System.in);
		   boolean done=false;
		   while(!done) {
			   System.out.println("D)eposit W)ithdraw M)onth end Q)uit: ");
			   String input=in.next();
			   if(input.equals("D")||input.equals("W")){
				  System.out.println("Enter account the amount: ");
				  double amount=in.nextDouble();
				  if(input.equals("D")) {
					accounts.deposit(amount);
				  }
				  else 
				  {
					accounts.withdraw(amount);	  
				  }
				  System.out.println("Balance: "+accounts.getBalance());
			   }
			   else if(input .equals("M")) {
				   System.out.println(accounts.getBalance());
			   }
			   else if(input=="Q"){
				   done=true;
			   }
		   }
	   }
}
