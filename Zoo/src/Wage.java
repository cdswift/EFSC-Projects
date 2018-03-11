import java.util.ArrayList;
import java.util.UUID;

public class Wage {
	private Employee employee;
	private int hoursWorked = 40;
	private static ArrayList<Wage> wageList = new ArrayList<>();
	
	public Wage(Employee employee)
	{
		this.employee = employee;
		wageList.add(this);
	}
	
	public Employee getEmployee()
	{
		return employee;
	}
	
	public void adjustHours(int newHours)
	{
		if (newHours > 40)
		{
			if (this.employee.isOTEligible())
				this.hoursWorked = newHours;
			else 
				System.out.println("This employee not eligible for OT.");
		}
		else
			hoursWorked = newHours;
	}
	
	public double calculatePay()
	{
		if (hoursWorked > 40)
		{
			int hoursMoreThan40 = hoursWorked - 40;
			return ((hoursWorked - hoursMoreThan40) * employee.getWage()) + hoursMoreThan40 * (employee.getWage() * 1.5);
		}
		else
			return employee.getWage() * hoursWorked;
	}
	
	public int getHours()
	{
		return hoursWorked;
	}
}
