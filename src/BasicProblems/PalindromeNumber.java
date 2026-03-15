package BasicProblems;

import java.util.*;

public class PalindromeNumber {
    static void palindromeCheck(int n){
        if(n<0){
            System.out.println(" not a Palindrome");
            return ;
        }
        int copy = n ;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 +  (n%10) ;
            n /= 10;
        }
        if(copy == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        palindromeCheck(n);
    }
}
