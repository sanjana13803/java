package com.xworkz.laptopspec.motherboard;

public class MotherBoard {

    public String model;
    public String chipset;
    public int ramSlots;
    public String socketType;
    public boolean hasIntegratedGraphics;

    public void displayDetails() {
        System.out.println("Motherboard Model: " + model);
        System.out.println("Chipset: " + chipset);
        System.out.println("RAM Slots: " + ramSlots);
        System.out.println("Socket Type: " + socketType);
        System.out.println("Integrated Graphics: " + hasIntegratedGraphics);


    }
}

