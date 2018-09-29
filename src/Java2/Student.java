package Java2;

import java.util.Random;
import java.text.DecimalFormat;

public class Student
{
	private String name;
	private String address;
	private String major;
	private double GPA;
	private static Random rand = new Random();
	private static DecimalFormat fmt = new DecimalFormat("0.###");
	public Student (String newName, String newAddress, String newMajor)
	{
		name = newName;
		address = newAddress;
		major = newMajor;
		computeGPA();
	}
	
	public Student (String newName, String newAddress)
	{
		name = newName;
		address = newAddress;
		major = "Undeclard";
		computeGPA();
	}
	
	public void setName(String newName) 
	{
	    name = newName;
	}

	public String getName() 
	{
	    return name;
	}
	
	public void setAddress(String newAddress) 
	{
	    address = newAddress;
	}

	public String getAddress() 
	{
	    return address;
	}
	
	public void setMajor(String newMajor) 
	{
	    major = newMajor;
	}

	public String getMajor() 
	{
	    return major;
	}
	public double getGPA() 
	{
	    return GPA;
	}
	
	public void computeGPA()
	{
		GPA = 0.5 + (rand.nextDouble() * 3.5);
	}
	
	public String toString()
	{
		String result = "";
		result += ("Name: "+ name + "\n");
		result += ("Address: " + address + "\n");
		result += ("Major: " + major + "\n");
		result += ("GPA: " + fmt.format(GPA) + "\n");
		
		return result;
	}
		
}
