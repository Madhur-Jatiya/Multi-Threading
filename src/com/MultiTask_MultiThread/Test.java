package com.MultiTask_MultiThread;

public class Test{
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);
        
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

