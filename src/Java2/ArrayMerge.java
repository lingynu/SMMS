package Java2;

import java.util.ArrayList;

    /*
	 * Created with IntelliJ IDEA.
	 * User: huchunyang
	 * Date: 13-11-8
	 * Time: 下午10:08
	 * To change this template use File | Settings | File Templates.
	 */
	public class ArrayMerge {

	    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
	        int i = 0;
	        int j = 0;
	        int k = 0;

	        ArrayList<Integer> c = new ArrayList<Integer>(a.size() + b.size());

	       // System.out.println(a.size());

	        while (i < a.size() && j < b.size())
	        {
	            if (a.get(i) < b.get(j))
	            {
	                c.add(k, a.get(i));
	                i++;
	            }
	            else
	            {
	                c.add(k, b.get(j));
	                j++;
	            }
	            k++;
	        }

	        // More a elements to add?
	        if (i < a.size())
	        {
	            while (i < a.size())
	            {
	                c.add(k, a.get(i));
	                i++;
	                k++;
	            }
	        } else if (j < b.size())  // More b elements to add?
	        {
	            while (j < b.size())
	            {
	                c.add(k, b.get(j));
	                j++;
	                k++;
	            }
	        }
	        return c;
	    }

	    public static void main(String[] args)
	    {
	        ArrayList<Integer> a = new ArrayList<Integer>();
	        ArrayList<Integer> b = new ArrayList<Integer>();

	        // Initialize array list a to some values
	        for (int i = 0; i < 4; i++)
	        {
	            a.add(i, (i + 1) * (i + 1));
	        }

	        //System.out.println(a.size());

	        // Initialize array list b to some values
	        b.add(0, 4);
	        b.add(1, 7);
	        b.add(2, 9);
	        b.add(3, 9);
	        b.add(4, 11);

	       // System.out.println(b.size());

	        ArrayList<Integer> c = mergeSorted(a, b);


	        System.out.println("Result of merge sort of a and b is " );

	        for (int i = 0; i < c.size(); i++)
	        {
	            System.out.print(c.get(i) + " ");
	        }
	    }

	}


