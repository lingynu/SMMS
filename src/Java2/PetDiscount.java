package Java2;

	import java.util.*;

	/**
	 * Created with IntelliJ IDEA.
	 * User: huchunyang
	 * Date: 13-11-8
	 * Time: 下午9:08
	 * To change this template use File | Settings | File Templates.
	 */
	public class PetDiscount {

	    public static void discount(double[] prices, boolean[] isPet, int nItems)
	    {
	        boolean flag = false;
	        double total = 0.0;
	        int pets = 0;

	        if (nItems >= 6)
	        {
	            for (int i = 0; i < isPet.length; i++)
	            {
	                if (isPet[i] == true)
	                {
	                    pets++;
	                    flag = true;
	                }
	            }

	            if (flag == true && (nItems-pets) >= 5)
	            {
	                for (int i = 0; i < prices.length ; i++)
	                {
	                    if (isPet[i] == true)
	                    {
	                        total = total + prices[i];
	                    }
	                    else
	                    {
	                        total = total + prices[i] * .8;
	                    }
	                }
	            }
	            System.out.println("Final price after discount " + total );
	        }
	    }

	    public static void main(String[] args)
	    {
	        double[] prices1 = new double[100];
	        boolean[] isPet1 = new boolean[100];

	        Scanner in = new Scanner(System.in);
	        boolean done = false;
	        int i = 0;

	        while (!done)
	        {
	            System.out.println("Enter the price, or -1 to quit: " );

	            double d = in.nextDouble();
	            if (d == -1)
	            {
	                done = true;
	            }
	            else
	            {
	                if (done == false)
	                {
	                    prices1[i] = d;
	                    System.out.println("Is it a pet? y/n" );
	                    String t = in.next();

	                    if (t.equals("Y") || t.equals("y"))
	                    {
	                        isPet1[i] = true;
	                    }
	                    else
	                    {
	                        isPet1[i] = false;
	                    }
	                    i++;
	                }
	            }
	        }
	        discount(prices1, isPet1, i);
	    }

	}


