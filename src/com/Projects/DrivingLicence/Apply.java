package com.Projects.DrivingLicence;

class Apply implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Apply for Driving Licence");
    }
}