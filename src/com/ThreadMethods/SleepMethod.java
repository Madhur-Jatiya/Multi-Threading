package com.ThreadMethods;

public class SleepMethod implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        SleepMethod sleepMethod = new SleepMethod();
        Thread th = new Thread(sleepMethod);
        th.setName("Thread 1");
        th.start();

        Thread th2 = new Thread(sleepMethod);
        th2.setName("Thread 2");
        th2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
