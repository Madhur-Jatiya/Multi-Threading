package Synchronization.Ticket_Booking_With_Static_Synchronization;

public class MyThread extends Thread{

    TicketBooking tb;
    int seats;

    public MyThread(TicketBooking tb, int seats) {
        this.tb = tb;
        this.seats = seats;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        tb.seatBooking(seats);
        
    }
}

class MyThread2 extends Thread{

    TicketBooking tb;
    int seats;

    public MyThread2(TicketBooking tb, int seats) {
        this.tb = tb;
        this.seats = seats;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        tb.seatBooking(seats);
    }
}
