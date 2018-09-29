package array;

import java.util.Random;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a=new int[30];
		int i,j;
		Random b=new Random(100);
		for(i=0;i<a.length;i++) {
			a[i]=b.nextInt(100);
		    System.out.print(a[i]+"\t");		    
		}
		for(i=0;i<a.length;i++) {
			if(a[i]==a[0])
				a[0]=b.nextInt(100);
			System.out.println(a[i]+"\t");
		}
		for(i=0;i<a.length;i++) {
			java.util.Arrays.sort(a);
			for(j=a.length-1;j>=0;j--)	{
				System.out.println(a[j]);
			}
		}	
	}
}
