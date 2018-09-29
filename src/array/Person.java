package array;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	public Person (String newFirstName, String newLastName, int newAge)
	{
	firstName = newFirstName;
	lastName = newLastName;
	age = newAge;
	}
	public String getFirstName()
	{
	return firstName;
	}
	public String getLastName()
	{
	return lastName;
	}
	public int getAge()
	{
	return age;
	}
	public boolean equals(Person p) {
		return (firstName==p.getFirstName()&&lastName==getLastName()&&age==getAge());
	}
}
