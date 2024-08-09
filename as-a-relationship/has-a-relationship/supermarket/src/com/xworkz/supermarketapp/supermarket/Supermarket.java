package com.xworkz.supermarketapp.supermarket;

import com.xworkz.supermarketapp.worker.Worker;

public class Supermarket {
   public String workerName;
    Worker worker;

    public boolean callWorker(Worker worker) {
            boolean isWorkerFound = false;

        if(workerName != null) {
          this.worker=worker;
          this.worker.getWorkerDetails();
            isWorkerFound = true;

        }
    return isWorkerFound;
    }


}
