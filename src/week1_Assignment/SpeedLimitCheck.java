package week1_Assignment;

import java.util.*;

public class SpeedLimitCheck {
    static void limitCheck(int speed){
        final int limit = 60 ;
        System.out.println((speed > limit) ? "OverSpeeding pay fine" : "You are within the limit");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed : ");
        int speed = input.nextInt();

        limitCheck(speed);
    }
}
