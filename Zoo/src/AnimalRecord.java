import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;


public class AnimalRecord {

	private String name;
	HashMap <UUID, Animal> record;
	
	public AnimalRecord(String _name)
	{
		name = _name;
		record = new HashMap<UUID, Animal>();
	}
	
	public void newAnimal(Animal _animal)
	{
		record.put(_animal.getID(), _animal);
	}
	
	public void animalDies(Animal _animal)
	{
		record.remove(_animal.getID());
		System.out.println("Animal ID:" + _animal.getID() + " removed from " + this.name + ".\n");
	}
	
	
	public void printRecord()
	{
		System.out.println("Animal report for " + this.name + "\n");
		Iterator it = record.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			Animal a = (Animal)pair.getValue();
			a.printAnimal();
			System.out.println("");
		}
	}
}
