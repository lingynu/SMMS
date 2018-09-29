package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TopCustomer {
	public static ArrayList<String> nameOfBestCustomer(ArrayList<Double> sales,ArrayList<String> customers,int topN) {
		ArrayList<Double> list=sales;
		ArrayList<String> top=new ArrayList<String>();
		Collections.sort(list);
		int index;
		for(int i=0;i<topN;i++) {
			if(i<list.size()) {
				index=sales.indexOf(list.get(list.size()-1-i));
				top.add("Number "+(i+1)+" is "+customers.get(index)+" ,sales is "+sales.get(index));
			}
			else
				break;
		}
		return top;
	}
	public static void main(String[] args) {
		ArrayList<Double> salesList=new ArrayList<Double>();
		ArrayList<String> customersList=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		Collections.addAll(salesList, 130.5,220.7,170.6,119.3,156.5);
		Collections.addAll(customersList, "Terry","Andy","Marry","Tony","Jack");
		ArrayList<String> top=nameOfBestCustomer(salesList,customersList,3);
		for(String str:top) {
			System.out.println(str);
		}
	}
}

