//windows not support priority
package com.ThreadMethods;

public class Priority implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        System.out.println("Main thread priority = "+Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(9);
//        System.out.println("New Main thread priority = "+Thread.currentThread().getPriority());
        Priority priority = new Priority();
        
        Thread th = new Thread(priority);
        th.setPriority(10);
        th.setName("priority 10");
        th.start();
        
        Thread th2 = new Thread(priority);
        th2.setPriority(5);
        th2.setName("priority 5");
        th2.start();
        
        Thread th3 = new Thread(priority);
        th3.setPriority(4);
        th3.setName("priority 4");
        th3.start();
        
        Thread th4 = new Thread(priority);
        th4.setPriority(8);
        th4.setName("priority 8");
        th4.start();
        
        Thread th5 = new Thread(priority);
        th5.setPriority(2);
        th5.setName("priority 20");
        th5.start();
    }
    
}
