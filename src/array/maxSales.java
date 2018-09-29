package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class maxSales {
	public static String nameOfBestCustomer(ArrayList<Double> sales,ArrayList<String> customers) {
		ArrayList<Double> list=sales;
		Collections.sort(list);
		int index=sales.indexOf(list.get(list.size()-1));
		//System.out.println("Index="+index);
		return "BestCustomer is "+customers.get(index)+" ,sales is "+sales.get(index);
	}
	public static void main(String[] args) {
		ArrayList<Double> salesList=new ArrayList<Double>();
		ArrayList<String> customersList=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�Ƿ���˿���Ϣ��(Y/N):");
			if(sc.next().charAt(0)=='Y') {
				System.out.print("�ù˿�����Ϊ��");
				sc.nextLine();
				String name=sc.nextLine();
				customersList.add(name);
				System.out.print("�ù˿����ѽ��Ϊ:");
				double prices=sc.nextDouble();
				salesList.add(prices);
			}
			else
				break;
		}
		System.out.println(nameOfBestCustomer(salesList,customersList));
	}
}

