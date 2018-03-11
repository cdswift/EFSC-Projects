import java.util.ArrayList;

public class FinancialRecord {

	private int numTransactions = 0; 
	private String title;
	private String description;
	private ArrayList<Ticket> transactionList = new ArrayList<>();
	private int totalTix;
	private double totalRevenue = 0;
	
	public FinancialRecord(String title, String description)
	{
		this.title = title;
		this.description = description;
	}
	
	public void addTransaction(Ticket t) 
	{
		transactionList.add(t);
		totalRevenue += t.calculateAmountOwed();
		totalTix += t.getNumTickets();
	}
	
	public void printRecord()
	{
		System.out.println("Record for: " + this.description);
		System.out.println("\nTotal transactions: " + transactionList.size());
		System.out.println("Total tickets sold: " + totalTix);
		System.out.println("TotalRevenue: " + totalRevenue);
	}

}
