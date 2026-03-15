package BasicProblems;

import java.util.*;

public class ReverseString_Stack {
    static void reverseString(String str){
        if(str.length() <= 0){
            System.out.println("Invalid String");
            return;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string :  ");
        String str = input.next();

        reverseString(str);
    }
}
