package Multithreading;

public class BookedTicket {
	
	public static void main(String[] args) {
		
		TicketBooking booking = new TicketBooking();
		
		Thread t1 = new Thread( () ->{
			
			for(int i = 0; i < 2; i++) {
				booking.bookticket(2);
				
				try {
					Thread.sleep(50);
				}catch(InterruptedException e) {
					 e.printStackTrace();
				}
			}
			
		});
		
	Thread t2 = new Thread( () ->{
			
			for(int i = 0; i < 2; i++) {
				booking.bookticket(3);
				
				try {
					Thread.sleep(40);
				}catch(InterruptedException e) {
					 e.printStackTrace();
				}
			}
			
		});
	
	  t1.start();
	  t2.start();
	  
	  try {
		  t1.join();
		  t2.join();
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  System.out.println("Final Available Tickets = "+booking.getAvailableTickets());
		
	}

}
