package com.ThreadMethods;
public class getName {
    public static void main(String[] args) {
        System.out.println("Old thread Name = "+Thread.currentThread().getName());
        Thread.currentThread().setName("Madhur");
        System.out.println("New thread Name = "+Thread.currentThread().getName());
    }
}
