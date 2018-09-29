package Java2;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarket {
	public static String nameOfBestCustomer(ArrayList<Double>sales,ArrayList<String>customers) {
		double a=sales.get(0);
		int b;
		for(int i=0;i<sales.size();i++) {
			if(sales.get(i)>a) {
				a=sales.get(i);
			}
		}
		b=sales.indexOf(a);
		return customers.get(b);
	}	
	public static void main(String[] args) {
		ArrayList<Double> sales1=new ArrayList<Double>();
		ArrayList<String> customers1=new ArrayList<String>();
		boolean flag=false;
		int i=0;
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		while(!flag) {
		double in1=sc1.nextDouble();
		if(in1==0) {
			flag=true;
		}
		else{
			if(flag==false) {
				String in2=sc2.nextLine();
				sales1.add(in1);
				customers1.add(in2);
			}
			i++;
		}
		}
		nameOfBestCustomer(sales1,customers1);
		System.out.println(customers1.get(i));
	}
}
