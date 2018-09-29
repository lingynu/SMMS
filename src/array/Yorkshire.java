package array;

public class Yorkshire extends Dog {
	private static int breedWeight = 75;
	public Yorkshire(String name,int breedWeight)
	{
	this.breedWeight=breedWeight;
	this.name=name;
	}
	// ------------------------------------------------------------
	// Small bark -- overrides speak method in Dog
	// ------------------------------------------------------------
	public int avgBreedWeight()
	{
	return breedWeight;
	}
	public String speak()
	{
	return "woof";
	}
}
