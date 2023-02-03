package Synchronization.Ticket_Booking_Without_Synchronization;

public class TicketBooking {

    private int total_seats = 10;

    public void seatBooking(int seat) {
        if (seat < total_seats) {
            System.out.println("Seat Booked Successfully");
            total_seats = total_seats - seat;
            System.out.println("Remaining seats = " + total_seats);
        } else {
            System.out.println("Seat Not Booked");
            System.out.println("Remaining seats = " + total_seats);
        }
    }
}
