import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class TestApp {

	public static void main(String[] args) {
		
		
		System.out.println("**********ZOO IT System Test START**************");
		System.out.println("***This is a test for the animal portion of the ZOO IT system.\n");
		
		
		//create new record for animals
		AnimalRecord recordOfAnimals = new AnimalRecord("Zoo Record");
		
		//create new animals and add them to log
		Animal animal1 = new Animal("Zebra", Animal.Sex.Male, "Lots of grass", recordOfAnimals);
		Animal animal2 = new Animal("Lion", Animal.Sex.Female, "Raw meat", recordOfAnimals);
		Animal animal3 = new Animal("Otter", Animal.Sex.Female, "Fish and seaweed", recordOfAnimals);
		
		//print record of animals
		recordOfAnimals.printRecord();
		//one animal dies
		recordOfAnimals.animalDies(animal1);
		//print record to see changes
		recordOfAnimals.printRecord();
		
		System.out.println("***Animal portion of ZOO IT system ended.\n");
		
		System.out.println("***This is a test for the employee and payroll portion of the ZOO IT system.\n");
		
		Employee employee1 = new Employee("John", "Doe", "12345678901", 15.00, "June 5th, 1984", "January 3rd, 2016", true);
		Employee employee2 = new Employee("Jane", "Doe", "008387265", 17.00, "June 20th, 1974", "January 8th, 2012", false);
		Employee employee3 = new Employee("Barb", "Walters", "883662534", 12.00, "January 6th, 1981", "August 23rd, 2014", true);
		
		System.out.println("List of current employees.\n");
		Employee.printAllEmployees();
		
		System.out.println("Must generate wages for each employee.\n");
		
		ArrayList<Wage> wageList = new ArrayList<>();
		
		Iterator it = Employee.employeeList.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			Employee e = (Employee)pair.getValue();
			wageList.add(new Wage(e));
		}
		
		System.out.println("Must generate payroll to process wages for each employee.\n");
		
		Payroll payroll1 = new Payroll("First Payroll");
		payroll1.generatePayStubs(wageList);
		
		System.out.println("***Payroll and Employee portion of ZOO IT system ended.\n");
		
		System.out.println("***This is a test of the ticket sales and record keeping portion of the ZOO IT system.\n");
		System.out.println("Must generate financial record before generating tickets.\n");
		
		FinancialRecord finances = new FinancialRecord("Test finances record", "January 2018");
		
		System.out.println("Selling tickets...\n");
		Ticket t1 = new Ticket(20, finances);
		Ticket t2 = new Ticket(15, 3, finances);
		Ticket t3 = new Ticket(15, finances);
		Ticket t4 = new Ticket(20, 2, finances);
		
		System.out.println("Summary for finance record.\n");
		finances.printRecord();

		System.out.println("************ZOO IT System Test END**************");
	}

}
