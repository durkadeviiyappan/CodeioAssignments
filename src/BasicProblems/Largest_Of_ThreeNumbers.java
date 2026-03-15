package BasicProblems;

import java.util.*;

public class Largest_Of_ThreeNumbers {
    static int findLargest(int a , int b , int c){
        return ((a>b)?((a>c)? a : c ):((b>c) ? b : c)) ;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 1st Number : ");
        int a = input.nextInt();
        System.out.println();

        System.out.print("Enter a 2nd Number : ");
        int b = input.nextInt();
        System.out.println();

        System.out.print("Enter a 3rd Number : ");
        int c = input.nextInt();
        System.out.println();

        System.out.println(findLargest(a,b,c));
    }
}
