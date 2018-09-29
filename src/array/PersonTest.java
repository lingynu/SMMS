package array;

public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person("Zhang","Yun",20);
		Person p2=new Person("Zhang","Yun",20);
		System.out.println(p1.equals(p2));
	}
}
