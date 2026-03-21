package week2_Assignment;

import java.util.*;

public class ReverseNumber_WhileLoop {
    static void reverse(int n){
        int rev = 0;
        while(n>0){
            rev *= 10 ;
            rev += (n%10);
            n /= 10 ;
        }
        System.out.println("Reverse : " + rev);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        reverse(n);
    }
}
