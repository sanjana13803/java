package com.xworkz.hotelapp.rooms;

public class Rooms {
   public int capacity;
    public String roomNumber;
    public String roomType;
    public double pricePerNight;
    public String services;

    public   void  getRoomDetails(){
        System.out.println("roomNumber  :"+roomNumber);
        System.out.println("room type :"+roomType);
        System.out.println("price per night "+pricePerNight);
        System.out.println("sharing :"+capacity);
        System.out.println("services provides are :"+services);


    }

}
