//driving licence
package com.Projects.DrivingLicence;

public class DrivingLicence implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        DrivingLicence drivingLicence = new DrivingLicence();
        Thread th = new Thread(drivingLicence);

        Apply apply = new Apply();
        Thread th1 = new Thread(apply);

        DocumentVerification documentVerification = new DocumentVerification();
        Thread th2 = new Thread(documentVerification);

        BioMetricVerification bmv = new BioMetricVerification();
        Thread th3 = new Thread(bmv);

        OfficerSignature os = new OfficerSignature();
        Thread th4 = new Thread(os);

        th1.start();
        th1.join();

        th2.start();
        th2.join();

        th3.start();
        th3.join();

        th4.start();
        th4.join();

        th.start();
    }

    @Override
    public void run() {
        System.out.println("Applied Successfully");
    }
}
