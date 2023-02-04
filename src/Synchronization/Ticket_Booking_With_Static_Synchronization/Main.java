package Synchronization.Ticket_Booking_With_Static_Synchronization;

public class Main{

    public static void main(String[] args) {
        TicketBooking tb1 = new TicketBooking();
        MyThread mt1 = new MyThread(tb1, 6);
        mt1.setName("mt1");
        mt1.start();
        
        MyThread2 mt2 = new MyThread2(tb1, 9);
        mt2.setName("mt2");
        mt2.start();
        
        //=======================================================
        
        TicketBooking tb2 = new TicketBooking();
        MyThread mt3 = new MyThread(tb2, 8);
        mt3.setName("mt3");
        mt3.start();
        
        MyThread2 mt4 = new MyThread2(tb2, 5);
        mt4.setName("mt4");
        mt4.start();
    }
}
