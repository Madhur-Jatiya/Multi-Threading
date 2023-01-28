package com.ThreadMethods;

public class DaemonThread implements Runnable {

    @Override
    public void run() {
        System.out.println("I am Thread-0");
    }

    public static void main(String[] args) {
//        System.out.println("I am Main Thread");
        DaemonThread daemonThread = new DaemonThread();
        Thread th = new Thread(daemonThread);
        th.setDaemon(true);
        System.out.println(th.isDaemon());
        th.start();
    }

}
