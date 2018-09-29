package Java2;

import java.util.Random;
import java.util.Scanner;

public class ComboLock {
	private int secret1;
	private int secret2;
	private int secret3;
	private int lockState;
	private int currentNumber;
	private boolean validSoFar;
	public ComboLock(int secret1,int secret2,int secret3) {
		 this.secret1=secret1;
		 this.secret2=secret2;
		 this.secret3=secret3;
		 lockState=0;
		 currentNumber=0;
		 validSoFar=true;
	}
	public void reset() {
		 lockState=0;
		 currentNumber=0;
		 validSoFar=true;
	}
	public void turnLeft(int ticks) {
		 currentNumber=(currentNumber+ticks)%40;
		 if (lockState==1) 
		 {
			 if(currentNumber==secret2) 
			 {
				 lockState=2;
			 }
		 }
		 else
		 {
			 validSoFar=false;
		 }
	}
	public void turnRight(int ticks) {
		currentNumber=(currentNumber-ticks)%40;
		if(lockState==0) 
		{
			if(currentNumber==secret1)
			{
				lockState=1;
			}
		}
		else if(lockState==2)
		{
			if(currentNumber==secret3)
			{
				lockState=3;
			}
		}
		else
		{
			validSoFar=false;
		}
	}
	public boolean open() {
		return lockState==3&&validSoFar;
	}
	public static void main(String[] args) {
		Random randomizer=new Random();
		int secret1=12;
		int secret2=12;
		int secret3=12;
		ComboLock lock=new ComboLock(secret1,secret2,secret3);
		Scanner in=new Scanner(System.in);
		boolean opened=false;
		boolean turningRight=true;
		while(!opened){
			System.out.println("Enter number of ticks to turn to the "+(turningRight?"right":"left")+"0-39.Enter an invalid number to quit.");
			int ticks=in.nextInt();
			if((ticks<0)||(ticks>39))
			{
				System.out.println("Invalid entry.The progrem will now exit");
				return;
			}
			if(turningRight)
				lock.turnRight(ticks);
			else
				lock.turnLeft(ticks);
			    turningRight=!turningRight;
			    opened=lock.open();
		}
		System.out.println("You opened the lock!");
	}
}
