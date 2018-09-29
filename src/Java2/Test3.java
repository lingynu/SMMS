package Java2;

public class Test3 {
	public static void main(String[] args) {
		Employee a=new Employee();
		Manager b=new Manager();
		Executive c=new Executive();
		a.setName("Jick");
		a.setGalary(5000);
		b.setName("Mary");
		b.setGalary(10000);
		b.setDepartment("QQMusic");
		c.setName("Lisa");
		c.setGalary(150000);
		c.setDepartment("WeChat");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
