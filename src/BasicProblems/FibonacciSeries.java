package BasicProblems;

import java.util.Scanner;

public class FibonacciSeries {
    static void fibonacciSeries(int n){
        if(n<=0){
            System.out.println("Invalid value");
            return;
        }
        int a = 0 ;
        int b = 1 ;
        System.out.print(a + " " + b + " ");
        for(int i=2 ; i<n ; i++){
            int c = a+b ;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        fibonacciSeries(n);
    }
}


