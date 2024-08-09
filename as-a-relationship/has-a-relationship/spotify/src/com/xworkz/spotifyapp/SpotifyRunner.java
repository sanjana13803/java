package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.songs.Songs;
import com.xworkz.spotifyapp.spotify.Spotify;

public class SpotifyRunner {
    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        spotify.song = "innunu bekagide";

        Songs songs = new Songs();
        songs.songName="Innunu bekagide";
        songs.songMovie="Mundina Nildana";
        songs.singer="vasuki vaibhav";
        songs.duration=3.4f;

        spotify.search(songs);

    }
}
