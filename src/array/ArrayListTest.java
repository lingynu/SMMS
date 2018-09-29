package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Bob");
		names.add(0,"Ann");
		names.remove(1);
		names.add("Car");
		Iterator it=names.iterator();
		while(((java.util.Iterator<String>) it).hasNext()) {
			String str=(String) it.next();
			System.out.println(str);
		}
	}

}

