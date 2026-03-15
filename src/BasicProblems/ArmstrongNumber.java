package BasicProblems;

import java.util.*;

public class ArmstrongNumber {
    static void armstrongNumberCheck(int n){
        if(n<=0){
            System.out.println("Invalid value");
            return;
        }
        int count = 0 ;
        int copy = n ;
        int sum = 0;
        while(n>0){
            count++;
            n /= 10;
        }
        n = copy ;
        while(copy>0){
            sum = sum + (int)Math.pow(copy%10,count);
            copy /= 10;
        }
        if(n == sum){
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

        armstrongNumberCheck(n);
    }
}
