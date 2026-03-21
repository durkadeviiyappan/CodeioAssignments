package week2_Assignment;

import java.util.*;

public class CountOccurances {
    static void countOccurance(int[] arr){
        if(arr.length<=1){
            System.out.println("Enter more than one element into array !!");
            return ;
        }
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
    for(int i=0 ; i<arr.length ; i++){
            int count = 0;
            if(list.contains(arr[i]) && i>0){
                continue;
            }
            else{
                if(i != 0)list.add(arr[i]);
                for(int j=0 ; j<arr.length ; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
            }
          System.out.println(arr[i] + " appears " + count + " times ") ;

        }
    //System.out.print(list);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a range : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter values into the Array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }

        countOccurance(arr);


    }
}
