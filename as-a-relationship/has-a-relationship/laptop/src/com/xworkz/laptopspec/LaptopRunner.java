package com.xworkz.laptopspec;

import com.xworkz.laptopspec.laptop.Laptop;
import com.xworkz.laptopspec.motherboard.MotherBoard;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.model="MSI MAG B550";

        MotherBoard motherBoard = new MotherBoard();
        motherBoard.model="MSI MAG B550";
        motherBoard.chipset="AMD B550";
        motherBoard.ramSlots=4;
        motherBoard.socketType="AM4";
        motherBoard.hasIntegratedGraphics=true;

        laptop.motherBoard(motherBoard);
    }
}
