package Multithreading;

public class TicketBooking {

	private int availableTicket = 10;
	
	public synchronized void bookticket(int tickets) {
		
		if(availableTicket >= tickets ) {
			availableTicket -= tickets;
			
			System.out.println("Booked "+tickets+"tickets, Remainning tickets : "+availableTicket);
			
		}else {
			System.out.println("Not enough tickets available to book " + tickets);
		}
		
	}
	
	public int getAvailableTickets() {
		return availableTicket;
	}
		
	
}
