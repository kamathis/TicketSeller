//Kristi Mathis
public class Tickets {
	

	private final int MIN_TICKETS = 1;
	private final int MAX_TICKETS = 6;
	private int ticketsAvailable = 0;
	private final int TOTAL_TICKETS = 45;
	private int ticketsSold = 0;
	
	
	public Tickets(int ticketsAvailable) {
		this.ticketsAvailable = ticketsAvailable;
	
	}

	public int getMIN_TICKETS() {
		return MIN_TICKETS;
	}

	public int getMAX_TICKETS() {
		return MAX_TICKETS;
	}

	public int getTicketsAvailable() {
		return ticketsAvailable;
	}

	public void setTicketsAvailable(int ticketsBought) {
		ticketsAvailable = ticketsAvailable - ticketsBought;
	}
	
	public double determinePercentage() {
		return (double)this.ticketsSold/(double)TOTAL_TICKETS;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsBought) {
		ticketsSold = ticketsSold + ticketsBought;
	}
	
	
	
	

	

	

}
