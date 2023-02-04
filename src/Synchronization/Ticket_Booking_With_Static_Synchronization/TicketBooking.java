package Synchronization.Ticket_Booking_With_Static_Synchronization;

public class TicketBooking {

    static private int total_seats = 20;

    static synchronized public void seatBooking(int seats) {
        if (seats <= total_seats) {
            System.out.println(seats + " Seat Booked Successfully");
            total_seats = total_seats - seats;
            System.out.println("Remaining seats = " + total_seats);
            System.out.println("");
        } else {
            System.out.println(seats + " Seat Not Booked");
            System.out.println("Remaining seats = " + total_seats);
            System.out.println("");
        }
    }
}
