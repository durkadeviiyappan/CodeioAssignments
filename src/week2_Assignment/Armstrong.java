package week2_Assignment;

import java.util.*;

public class Armstrong {
    static void checker(int n){
        int copy = n ;
        int arm = 0;
        int digit = 0;
        while(n > 0){
            digit++;
            n /= 10 ;
        }
        n = copy ;

        while(n > 0){
            arm += (int)Math.pow((n%10),digit);
            n /= 10 ;
        }
        if(arm == copy){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        checker(n);
    }
}
