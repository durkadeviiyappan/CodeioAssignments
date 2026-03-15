package BasicProblems;
import java.util.*;

public class ReverseNumber {
    static void reverseNumber(int n){
        int rev = 0;
        while(n != 0){
            rev = rev*10 + (n%10) ;
            n /= 10 ;
        }
        System.out.println("ReverseNumber : " + rev);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        reverseNumber(n);
    }
}
