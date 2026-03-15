package BasicProblems;

import java.util.*;

public class ReverseString {
    static void reverseString(String str){
        int n = str.length();
        for(int i=n-1 ; i>=0  ; i--){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();

        reverseString(str);
    }
}
