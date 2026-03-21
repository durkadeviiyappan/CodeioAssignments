package week2_Assignment;

import java.util.*;

public class Count_Positive_Negative_Zero_Array{
    static void count(int[] arr){
        if(arr.length == 0 ){
            System.out.println("Enter a values in Array ! ");
            return ;
        }
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i : arr){
            if(i == 0){
                zero++;
            }
            else if(i > 0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println("Positive : " + pos + "\n Negative : " + neg + "\n Zero : " + zero);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a range of Array  : ");
        int n = input.nextInt();


        int[] arr = new int[n];

        System.out.println("Enter a values into Array : ");

        for(int i=0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }

        count(arr);

    }
}
