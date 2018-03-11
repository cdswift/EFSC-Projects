
public class Ticket {
	private double price;
	private int numTickets;
	private double amountOwed;
	
	public Ticket(double price, FinancialRecord finances)
	{
		this.price = price;
		numTickets = 1;
		amountOwed = calculateAmountOwed();
		finances.addTransaction(this);
	}
	
	public Ticket(double price, int numTickets, FinancialRecord finances)
	{
		this.price = price;
		this.numTickets = numTickets;
		amountOwed = calculateAmountOwed();
		finances.addTransaction(this);
	}

	public double calculateAmountOwed() 
	{
		return this.numTickets * this.price;
	}

	public int getNumTickets() 
	{
		return numTickets;
	}
	
}
