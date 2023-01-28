package com.ThreadMethods;

public class JoinMethod implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod joinMethod = new JoinMethod();
        Thread th = new Thread(joinMethod);
        th.setName("Thread 1");
        
        th.start();
        th.join();        
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
