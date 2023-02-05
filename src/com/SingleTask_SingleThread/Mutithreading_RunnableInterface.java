//Single task with single thread
package com.SingleTask_SingleThread;
public class Mutithreading_RunnableInterface implements Runnable{
    public void run()
    {
        System.out.println("Run Method using Runnable Interface");
    }
    
    public static void main(String[] args) {
        Mutithreading_RunnableInterface m = new Mutithreading_RunnableInterface();
        Thread th = new Thread(m);
        th.start();
    }
    
}
