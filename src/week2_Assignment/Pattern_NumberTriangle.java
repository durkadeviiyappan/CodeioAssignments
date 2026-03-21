package week2_Assignment;

import java.util.*;

public class Pattern_NumberTriangle {
    static void pattern(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a n : ");
        int n = input.nextInt();

        pattern(n);
    }
}
