import java.util.UUID;

public class Animal {

	private UUID animalID;
	private String breed;
	private Sex sex;
	private String diet;
	
	public Animal()
	{
		animalID = UUID.randomUUID();
		breed = "unknown";
		sex = Sex.Unknown;
		diet = "unknown";
	}
	
	public Animal(String _breed, Sex _sex, String _diet, AnimalRecord destination)
	{
		animalID = UUID.randomUUID();
		breed = _breed;
		sex = _sex;
		diet = _diet;
		try{
		destination.newAnimal(this);
		}
		catch (Exception e)
		{
			System.out.println("Must create record of animals first.");
		}
	}
	
	public UUID getID()
	{
		return animalID;
	}
	public void printAnimal()
	{
		System.out.println("REPORT FOR ANIMAL ID <" + animalID + ">");
		//System.out.println("Animal ID: " + animalID);
		System.out.println("Breed: " + breed);
		System.out.println("Sex: " + sex);
		System.out.println("Diet: " + diet);			
	}
	
	public enum Sex
	{
		Male, Female, Unknown
	}
}
