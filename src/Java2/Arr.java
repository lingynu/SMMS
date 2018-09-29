package Java2;

import java.util.ArrayList;

public class Arr {
	public static void append(ArrayList<String> target,ArrayList<String> source) {
		for(int i=0;i<source.size();i++) {
			target.add(source.get(i));
		}
	}
	public static void main(String[] args) {
		ArrayList<String> names1 = new ArrayList<String>();
		ArrayList<String> a = new ArrayList<String>();
		names1.add("Bob");
		names1.add("Ann");
		names1.add("Cal");
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Dave");
		append(names1,names2);
		System.out.println(names1);
	}
}
