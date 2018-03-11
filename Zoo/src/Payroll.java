import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class Payroll {
	
	private String title;
	
	public Payroll(String title)
	{
		this.title = title;
	}
	
	public void generatePayStubs(ArrayList<Wage> wageList)
	{
		System.out.println("Pay stubs for " + this.title + "\n");
		for (Wage w : wageList)
		{
			double pay = w.calculatePay();
			System.out.println("Pay stub for Employee: " + w.getEmployee().getName());
			System.out.println("Hours worked: " + w.getHours());
			System.out.println("Amount owed: " + w.calculatePay());
			System.out.println("");
		}
	}
}
