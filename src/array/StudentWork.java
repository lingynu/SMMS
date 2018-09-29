package array;

import java.util.Random;

public class StudentWork {
	public static void main(String[] args) {
		int[] a=new int[30];
		int[] b=new int[30];
		int i;
		int j;
		for(i=0;i<a.length;i++) {
			a[i]=i+1;
			System.out.println(a[i]+"\t");
		}
		Random c=new Random(30);
		for(j=0;j<30;j++) {
			b[j]=c.nextInt(30);
		}
		for(j=0;j<30;j++) {
			if(b[j]==b[0])
				b[0]=c.nextInt(30);
			System.out.println(b[j]+"\t");
		}
		for(j=0;j<30;j++) {
			i=b[j];
			System.out.println(a[i]);
		}
	}
}
