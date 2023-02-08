//Clock Using Thread

package com.Projects;

public class SleepMethod {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 24; i++) {
                for (int j = 0; j < 60; j++) {
                {
                    Thread.sleep(1000);
                    System.out.println(i + ":" + j);
                    
                    if( i == 23 && j == 59)
                    {
                        System.out.println("=============================================================");
                        System.out.println("New Day");
                        System.out.println("=============================================================");
                        main(args);
                    }
                }
            }
        }
    }
}
