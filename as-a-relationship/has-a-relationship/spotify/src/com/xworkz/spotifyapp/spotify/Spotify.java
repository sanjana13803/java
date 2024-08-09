package com.xworkz.spotifyapp.spotify;

import com.xworkz.spotifyapp.songs.Songs;

public class Spotify {

   public String song;
    Songs songs;

            public boolean  search(Songs songs){
                      boolean isSearched = false;
                        if(song != null ){
                            this.songs=songs;
                            this.songs.songDetails();

                        }else System.out.println("No results found");


            return isSearched;
            }



}
