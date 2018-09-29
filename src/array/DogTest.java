package array;

public class DogTest {
	public static void main(String[] args)
	{
		Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.speak());
	Labrador labrador=new Labrador("Mary","green");
	System.out.println(labrador.name + " says " + labrador.speak() +" breed "+labrador.avgBreedWeight() );
	Yorkshire yorkshire=new Yorkshire("Job",55);
	System.out.println(yorkshire.name + " says " + yorkshire.speak()+" breed "+yorkshire.avgBreedWeight());
	}
}
