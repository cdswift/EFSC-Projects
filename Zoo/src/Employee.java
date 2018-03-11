import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class Employee {
	private String firstName;
	private String lastName;
	private String ssn;
	private UUID employeeNum;
	private double wage;
	private String dob;
	private String dateHired;
	private boolean isActive = true;
	private boolean OTApproved;
	private double OTWage;
	public static HashMap<UUID, Employee> employeeList = new HashMap<>();
	
	
	Employee(String firstName, String lastName, String ssn, double wage, String dob, String dateHired, boolean OTApproved)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.wage = wage;
		this.dob = dob;
		this.dateHired = dateHired;
		this.OTApproved = OTApproved;
		this.employeeNum = UUID.randomUUID();
		employeeList.put(this.employeeNum, this);
	}
	
	public boolean isOTEligible()
	{
		return OTApproved;
	}
	
	public UUID getEmployeeNum()
	{
		return employeeNum;
	}
	
	public String getName()
	{
		return String.format("%s %s", firstName, lastName);
	}
	
	public double getWage()
	{
		return wage;
	}
	
	public void printEmployee()
	{
		System.out.println("Employee Name: " + this.getName());
		System.out.println("SSN: " + this.ssn);
		System.out.println("Wage: " + wage);
		System.out.println("DOB: " + dob);
		System.out.println("Date Hired: " + this.dateHired);
	}
	
	public static void printAllEmployees()
	{
		Iterator it = employeeList.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			Employee e = (Employee)pair.getValue();
			e.printEmployee();
			System.out.println("");
		}
	}
	
	
}
