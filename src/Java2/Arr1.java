package Java2;

import java.util.ArrayList;

public class Arr1 {
	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,ArrayList<Integer> b){
		int i=0;
		int j=0;
		int k=0;
		int index=0;
		ArrayList<Integer> c=new ArrayList<Integer>(a.size()+b.size());
		while(i<a.size()&&j<b.size()) {
			if(a.get(i)<b.get(j)) {
				c.add(k,a.get(i));
			i++;
			}
			else {
				c.add(k,b.get(j));
			j++;
			}
			k++;
			index+=index;
		}
		if(i<a.size()) {
			while(i<a.size()) {
			c.add(k,a.get(i));
			i++;
			k++;
			index+=index;
			}
		}
		else if(j<b.size()) {
			while(j<b.size()) {
			c.add(k,b.get(j));
			j++;
			k++;
			index+=index;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		a.add(0,1);
		a.add(1,4);
		a.add(2,9);
		a.add(3,16);
		b.add(0,4);
		b.add(1,7);
		b.add(2,9);
		b.add(3,9);
		b.add(4,11);
		ArrayList<Integer> c=mergeSorted(a,b);
		System.out.println(c);
	}	
}
