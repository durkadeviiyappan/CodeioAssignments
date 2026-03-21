package week2_Assignment;

import java.util.*;

public class Pattern_PyramidOfStars {
    static void pattern(int n){
        if(n<=0){
            System.out.println("Enter valid number : ");
            return ;
        }
        for(int i=1 ; i<=n ; i++){
            for(int s=1 ; s<=(n-i) ; s++){
                System.out.print(" " + " ");
            }
            for(int j=(n-i)+1 ; j<=(n+(i-1)) ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();

        pattern(n);
    }
}
