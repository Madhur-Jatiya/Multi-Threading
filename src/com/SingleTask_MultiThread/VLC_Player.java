//Single task with multiple threads
package com.SingleTask_MultiThread;

public class VLC_Player implements Runnable{
    public void run()
    {
        System.out.println("Thread Method");
    }
    
    public static void main(String[] args) {
        //four thread are there
        VLC_Player m = new VLC_Player();
        
        Thread voice = new Thread(m);
        voice.start();
        
        Thread video = new Thread(m);
        video.start();
        
        Thread timer = new Thread(m);
        timer.start();
    }
    
}
