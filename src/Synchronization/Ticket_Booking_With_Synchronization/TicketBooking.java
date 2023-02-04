package Synchronization.Ticket_Booking_With_Synchronization;

public class TicketBooking {

    private int total_seats = 10;

    synchronized public void seatBooking(int seats) {
        if (seats <= total_seats) {
            System.out.println(seats + " Seat Booked Successfully");
            total_seats = total_seats - seats;
            System.out.println("Remaining seats = " + total_seats);
        } else {
            System.out.println(seats + " Seat Not Booked");
            System.out.println("Remaining seats = " + total_seats);
        }
    }
}
