package com.ThreadMethods;
public class setName implements Runnable{
    
    @Override
    public void run() {
        Thread.currentThread().setName("New Thread");
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        System.out.println("Old thread Name = "+Thread.currentThread().getName());
        Thread.currentThread().setName("Madhur");
        System.out.println("New thread Name = "+Thread.currentThread().getName());
        
        setName gName1 = new setName();
        Thread th = new Thread(gName1);
        th.start();
        System.out.println(th.isAlive());
        th.setName("New Thread1");
        System.out.println(th.getName());
        
        
    }

    
}
