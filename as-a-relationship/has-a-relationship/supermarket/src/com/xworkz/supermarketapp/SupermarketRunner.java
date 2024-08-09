package com.xworkz.supermarketapp;

import com.xworkz.supermarketapp.supermarket.Supermarket;
import com.xworkz.supermarketapp.worker.Worker;

public class SupermarketRunner {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        supermarket.workerName= "sidramaiha";

        Worker worker = new Worker();
        worker.workerId="102";
        worker.workerName="sidramaiha";
        worker.gender="male";
        worker.shift="night";

        supermarket.callWorker(worker);
    }
}
