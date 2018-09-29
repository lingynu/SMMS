package Java2;

import java.util.Scanner;

public class BandBoosterDriver {
      public static void main(String[] args) {
    	    Scanner scan=new Scanner(System.in);
    	    System.out.println("Enter the name of the first booster:");
    	    BandBooster booster1=new BandBooster("A");
    	    System.out.println("Enter the name of the second booster:");
    	    BandBooster booster2=new BandBooster("B");
    	    for(int week=1;week<=3;week++) {
    	    	//System.out.println("Enter the number of boxes sold by" + booster1.getName() + "during week" +week+ ":");
    	        int boxesSold1=scan.nextInt();
    	        boxesSold1+=boxesSold1;
    	    	booster1.updateSales(boxesSold1);
    	    	System.out.println(boxesSold1);
    	    	//System.out.println("Enter the number of boxes sold by" + booster2.getName() + "during week" +week+ ":");
    	    	int boxesSold2=scan.nextInt();
    	    	boxesSold2+=boxesSold2;
    	    	System.out.println(boxesSold2);
    	    }
    	    System.out.println("Result sfter 3 weeks:"); 
    	    System.out.println(booster1);
    	    System.out.println(booster2);
      }
}
