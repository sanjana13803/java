package com.xworkz.supermarketapp.worker;

public class Worker {

    public String workerId;
    public String workerName;
    public String gender;
    public String shift;

    public void getWorkerDetails(){
        System.out.println("worker id :"+workerId);
        System.out.println("worker name :"+workerName);
        System.out.println("gender :"+gender);
        System.out.println("shift :"+shift);
    }

}
