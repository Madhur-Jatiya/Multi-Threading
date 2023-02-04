package Synchronization.Ticket_Booking_With_Synchronized_Block;

public class TicketBooking {

    private int total_seats = 10;

    public void seatBooking(int seats) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        synchronized (this) {
            if (seats <= total_seats) {
                System.out.println(seats + " Seat Booked Successfully");
                total_seats = total_seats - seats;
                System.out.println("Remaining seats = " + total_seats);
            } else {
                System.out.println(seats + " Seat Not Booked");
                System.out.println("Remaining seats = " + total_seats);
            }
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

    }
}
