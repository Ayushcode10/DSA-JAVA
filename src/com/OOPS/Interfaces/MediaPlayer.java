package com.OOPS.Interfaces;

public class MediaPlayer implements Media{
    @Override
    public void startPlayer() {
        System.out.println("start mediaplayer");
    }

    @Override
    public void stop() {
        System.out.println("stop mediaplayer");

    }
}
