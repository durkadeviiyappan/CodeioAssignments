package week4_Assignments;

import java.util.Scanner;

import java.util.*;

interface Playable{
    void play();
    void pause();
}
class AudioPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("play Audio player");
    }
    @Override
    public void pause(){
        System.out.println("pause Audio player");
    }
}
class VideoPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("play Video player");
    }
    @Override
    public void pause(){
        System.out.println("pause Video player");
    }
}
public class PlayableMedia_Interface {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Audio player(press a) or Video player(press v)");
        char play = sc.next().charAt(0);
        Playable p ;
        if(play == 'a'){
            p = new AudioPlayer();
            p.play();
            p.pause();
        }
        else if(play == 'v'){
            p = new VideoPlayer();
            p.play();
            p.pause();
        }
    }
}
