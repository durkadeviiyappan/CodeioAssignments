package week1_Assignment;

import java.util.*;

public class ReportCard {
    static char rankCalculation(int mark){
        char rank = (mark >= 90)?'A' : (mark >= 75) ?'B' : 'C' ;
        return rank ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int mark = input.nextInt();
        System.out.println(rankCalculation(mark));
    }
}
