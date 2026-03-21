package week2_Assignment;

import java.util.*;

public class SecondLargest_Array {
    static void secondLargest(int[] arr){
        int fLargest = arr[0];
        int sLargest = Integer.MIN_VALUE ;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] > fLargest){
                sLargest = fLargest ;
                fLargest = arr[i];
            }
            else if(arr[i] < fLargest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }
        System.out.println("Second Largest : " + sLargest);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter range of Array : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter a values in Array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }

        secondLargest(arr);
    }
}
