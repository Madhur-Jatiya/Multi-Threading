package com.Projects.DrivingLicence;

class DocumentVerification implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Document Verification");
    }
}
