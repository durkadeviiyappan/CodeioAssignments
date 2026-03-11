package week1_Assignment;
import java.util.*;
public class FastRunner {
    static void fastCalculation(int n1 , int n2){
        if(n1<0 || n2<0){
            System.out.println("invalid value");
        }
       else if(n1 == n2){
            System.out.println("Tie");
        }
         else if(n1 > n2){
            System.out.println("First runner  is faster");
        }
        else{
            System.out.println("Second runner  is faster");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed of first runner : ");
        int n1 = input.nextInt();
        System.out.println();
        System.out.print("Enter speed of second runner : ");
        int n2 = input.nextInt();
        System.out.println();

        fastCalculation(n1,n2);
    }
}
