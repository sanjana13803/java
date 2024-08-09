package com.xworkz.hotelapp.hotel;

import com.xworkz.hotelapp.rooms.Rooms;

public class Hotel {

    public int sharingPeoples;
    Rooms rooms;

          public boolean  rentRoom(Rooms rooms){
                    boolean isRoomRented=false;
                    if(sharingPeoples <=3){
                       this.rooms=rooms;
                        this.rooms.getRoomDetails();
                        isRoomRented = true;


                    }else System.out.println("nev thumba jana idera nimg onde room kodak agala...");

          return isRoomRented;
          }

}
