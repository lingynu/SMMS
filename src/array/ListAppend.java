package array;

import java.util.ArrayList;

public class ListAppend {
	public static void append(ArrayList<String> target,ArrayList<String> source) {
		for(int i=0;i<source.size();i++) {
			target.add(source.get(i));
		}
	}
	public static void main(String[] args) {
		ArrayList<String> names1=new ArrayList<String>();
		ArrayList<String> names2=new ArrayList<String>();
		names1.add("Emily");
		names1.add("Bob");
		names1.add("Cindy");
		names2.add("Dave");
		names2.add("Terry");
		append(names1,names2);
		for(String str:names1) {
			System.out.println(str);
		}
	}

}

