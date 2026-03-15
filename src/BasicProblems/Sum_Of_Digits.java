package BasicProblems;

import java.util.Scanner;

public class Sum_Of_Digits {
    static void sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += (n%10);
            n /= 10 ;
        }
        System.out.println("Sum of Digits : " + sum);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        sumOfDigits(n);
    }
}
