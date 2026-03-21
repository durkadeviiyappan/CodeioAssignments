package week2_Assignment;

import java.util.*;

public class CheckPalindrome {
    static String checker(int n){
        if(n<=1){
            return "Enetr valid n! " ;
        }
        int copy = n ;
        int digit = 0 ;
        int rev = 0;
        while(n > 0){
            digit++ ;
            n /= 10 ;
        }
        n = copy ;
        while(n > 0){
            rev = rev*10 ;
            rev += (n%10) ;
            n /= 10 ;

        }

        return ((copy == rev)?"Palindrome" : "Not a Palindrome" );

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a n : ");
        int n = input.nextInt();

        System.out.println(checker(n));
    }
}
