package BasicProblems;

import java.util.*;

public class Palindrome_Stack {
    static void palindromeChecker(int n){
        Stack<Integer> st = new Stack<>();
        String copy = n+"" ;
        String str = "";
        while(n>0){
            st.add(n%10);
            n /= 10 ;
        }
        while(!st.isEmpty()){
            str += st.pop();
        }
        if(str.equals(copy)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        palindromeChecker(n);
    }
}
