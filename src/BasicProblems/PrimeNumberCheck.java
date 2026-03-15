package BasicProblems;

import java.util.*;

public class PrimeNumberCheck {
    static boolean primeCheck(int n){
        if(n==1 || n==0){
            return false;
        }
        boolean prime = true;
        for(int i=2 ; i <n ; i++){
            if(n%i == 0){
               prime = false;
               break;
            }

        }
       return prime;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

       if(primeCheck(n)){
           System.out.println("prime");
       }
       else{
           System.out.println("not a prime");
       }
    }
}
