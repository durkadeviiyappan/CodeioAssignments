package BasicProblems;

import java.util.*;

public class Largest_Of_3Digts {
    static void findLarger(int n){
        if(n < 100){
            System.out.println("Invalid number");
            return;
        }
        int large = Integer.MIN_VALUE;

        while(n != 0){
            large = Math.max(large,(n%10));
            n /= 10 ;
        }
        System.out.println("Larger Value : " + large);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number(Within a three digits) : ");
        int n = input.nextInt();

        findLarger(n);
    }
}
