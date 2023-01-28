//Single task with single thread
package com.SingleTask_SingleThread;
public class Mutithreading_ThreadClass extends Thread{
    public void run()
    {
        System.out.println("Thread Method");
    }
    
    public static void main(String[] args) {
        Mutithreading_ThreadClass m = new Mutithreading_ThreadClass();
        m.start();
    }
    
}
