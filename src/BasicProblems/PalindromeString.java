package BasicProblems;

import java.util.*;

public class PalindromeString {
    static String palindromeChecker(String str){
        if(str.length() <= 0){
            System.out.println("Invalid String!");
        }
        String copy = "";
        for(int i=str.length()-1 ; i>=0 ; i--){
            copy += str.charAt(i);
        }
        return ((copy.equals(str)) ? "Palidrome" : "Not a Palidrome") ;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Staring : ");
        String str = input.next();

        System.out.println(palindromeChecker(str));
    }
}
