package Java2;

public class BankAccount {
   private double balance;
   public void deposit(double amount) {
	   balance=balance+amount;
   }
   public void withdraw(double amount) {
	   balance=balance-amount;  
   }
   public void monthEnd() {
	   
   }
   public double getBalance() {
	   return balance;
   }
}
