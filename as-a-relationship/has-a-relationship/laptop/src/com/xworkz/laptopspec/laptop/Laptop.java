package com.xworkz.laptopspec.laptop;

import com.xworkz.laptopspec.motherboard.MotherBoard;

public class Laptop {

  public  String model;
    MotherBoard motherBoard;

    public boolean motherBoard(MotherBoard motherBoard){
     boolean isPresent = false;
     if(model != null){
         this.motherBoard=motherBoard;
         this.motherBoard.displayDetails();
         isPresent=true;
     }else System.out.println("correct agi model hakuu brooo!!!!!");


    return isPresent;
    }


}
