//Single task with multiple threads
package com.SingleTask_MultiThread;

public class VLC_Player implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        //four thread are there
        VLC_Player m = new VLC_Player();
        
        Thread voice = new Thread(m);
        voice.setName("voice thread");
        voice.start();
        
        Thread video = new Thread(m);
        video.setName("video thread");
        video.start();
        
        Thread volume = new Thread(m);
        volume.setName("volumne thread");
        volume.start();
    }
    
}
