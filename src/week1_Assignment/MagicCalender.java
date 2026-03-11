package week1_Assignment;
import java.util.*;

public class MagicCalender {
    static void magicCalender(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a Leap year");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter year : ");
//        int year = input.nextInt();
        int[] year = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 1600, 2400, 1900, 2001, 2002, 2003, 2019, 2021, 2022, 2023, 2100, 2200};
        for (int i : year) {
            magicCalender(i);
        }
    }
}
