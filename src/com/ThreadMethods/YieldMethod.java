package com.ThreadMethods;

public class YieldMethod implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        YieldMethod yieldMethod = new YieldMethod();
        Thread th = new Thread(yieldMethod);
        th.setPriority(10);
        th.start();
//        Thread.yield();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
