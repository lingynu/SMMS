package Java2;

public class Manager extends Employee{
	public String department;
	public void setDepartment(String getDepartment) {
		department=getDepartment;
	}
	public String toString() {
		return "Manager[name="+name+" department="+department+" galary="+galary+"]";
	}
}