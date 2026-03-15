package BasicProblems;

import java.util.*;

public class PerfectNumber {
    static void perfectNumber_Checker(int n){
        int sum = 1;
        for(int i=2 ; i<n ; i++){
            if((n%i) == 0){
                sum += i;
            }
        }
        if(n == sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        perfectNumber_Checker(n);

    }
}
