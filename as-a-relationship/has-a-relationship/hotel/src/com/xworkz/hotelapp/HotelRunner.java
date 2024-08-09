package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.rooms.Rooms;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.sharingPeoples = 2;

        Rooms rooms = new Rooms();
        rooms.roomNumber="B01";
        rooms.roomType="AC";
        rooms.capacity=3;
        rooms.pricePerNight=3000;
        rooms.services="free wifi,24/7 hot water";

        hotel.rentRoom(rooms);
    }
}
