package Synchronization.Ticket_Booking_Without_Synchronized_Method;

public class Main implements Runnable {

    static TicketBooking ticketBooking = new TicketBooking();
    int seat;

    @Override
    public void run() {
        ticketBooking.seatBooking(seat);
    }

    public static void main(String[] args) {
        Main main1 = new Main();
        Thread th = new Thread(main1);
        main1.seat = 7;
        th.start();

        Main main2 = new Main();
        Thread th2 = new Thread(main2);
        main2.seat = 9;
        th2.start();
    }
}
