package week1_Assignment;
import java.util.*;
public class BiggestTreasure {
    static void find(int a , int b , int c){
       int biggestTreasure = (a > b)?((a > c)?a:c):((b > c)?b:c) ;
        System.out.println(biggestTreasure);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A : ");
        int  a = input.nextInt();
        System.out.println();
        System.out.print("Enter B : ");
        int b = input.nextInt();
        System.out.println();
        System.out.print("Enter C : ");
        int c = input.nextInt();
        System.out.println();

        find(a,b,c);

    }
}
