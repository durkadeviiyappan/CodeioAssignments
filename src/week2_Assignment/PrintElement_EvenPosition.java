package week2_Assignment;

import java.util.*;

public class PrintElement_EvenPosition {
    static void print(int[] arr){
        if (arr.length == 0) {
            System.out.println("Enter values in Array ! ");
            return;
        }
        for(int i=0 ; i<arr.length ; i++){
             if(i%2 == 0){
                 System.out.print(arr[i] + "  ");
             }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Range of Array : ");
        int n = input.nextInt();
        System.out.println();

        int[] arr = new int[n];

        System.out.println("Enter a values in Array : ");
        for(int i= 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }

        print(arr);

    }
}
