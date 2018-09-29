package Java2;

public class Employee {
	public String name;
	public double galary;
	public void setName(String getName) {
		name=getName;
	}
	public void setGalary(double getGalary) {
		galary=getGalary;
	}
	public String toString() {
		return "Employee[name="+name+" galary="+galary+"]";
	}
}
