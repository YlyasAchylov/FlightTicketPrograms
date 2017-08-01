import java.util.ArrayList;

public class FlightTicketsProgram {

	public static void main(String[] args) {
		
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		ArrayList<Flight> flights = new ArrayList<Flight>();
		
		Ticket ticket1 = new Ticket("201409112003", "George", "White", "TK2141");
		Ticket ticket2 = new Ticket("201408182023", "John", "Clemens", "TK1852");
		Ticket ticket3 = new Ticket("201409171004", "Alex", "Cats", "TK2141");
		tickets.add(ticket1);
		tickets.add(ticket2);
		tickets.add(ticket3);
		
		Flight flight1 = new Flight("TK2141", "THY",     "Ankara",    "Istanbul",   "25.08.2014", "14:00", "14:50");
		Flight flight2 = new Flight("TK1852", "THY",     "Barselona", "Istanbul",   "15.09.2014", "05:55", "10:20");
		Flight flight3 = new Flight("PC2136", "Pegasus", "Adana",     "Izmir",      "18.07.2014", "20:35", "22:40");
		Flight flight4 = new Flight("DL9450", "Delta",   "Frankfurt", "Amsterdam",  "20.09.2014", "10:55", "13:00");
		Flight flight5 = new Flight("KL1857", "KLM",     "Amsterdam", "Dusseldorf", "13.08.2014", "13:20", "14:30");
		Flight flight6 = new Flight("PC1177", "Pegasus", "Antalya",   "Istanbul",   "22.10.2014", "10:00", "12:40");
		
		flights.add(flight1);
		flights.add(flight2);
		flights.add(flight3);
		flights.add(flight4);
		flights.add(flight5);
		flights.add(flight6);
		
		//Step 1: print tickets
		System.out.println("Tickets:");
		System.out.print(ticket1);
		System.out.print(ticket2);
		System.out.print(ticket3);
		
		//Step 2: print flights
		System.out.println("\nExisting flights:");
		System.out.println(flight1);
		System.out.println(flight2);
		System.out.println(flight3);
		System.out.println(flight4);
		System.out.println(flight5);
		
		//Step 3: change a ticket
		System.out.println("Ticket change:");
		tickets.get(0).setFlightNumber("PC2136");
		System.out.print(tickets.get(0));
		
		//Step 4: change a flight
		System.out.println("\nFlight change:");
		flights.get(5).setDeparture("10:20");
		flights.get(5).setArrival("13:00");
		System.out.print(flights.get(5));

	}
