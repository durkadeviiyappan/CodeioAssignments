package BasicProblems;

import java.util.*;

public class FactorialNumber {
    static void factorialNumber(int n){
        int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact *= i ;
        }
        System.out.println("Factorial : " + fact);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        factorialNumber(n);
    }
}
