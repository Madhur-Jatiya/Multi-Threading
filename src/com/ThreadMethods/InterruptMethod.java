package com.ThreadMethods;

public class InterruptMethod implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.interrupted());
            System.out.println(Thread.currentThread().isInterrupted());
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        InterruptMethod interruptMethod = new InterruptMethod();
        Thread th = new Thread(interruptMethod);
        th.start();
        th.interrupt();
    }
}
