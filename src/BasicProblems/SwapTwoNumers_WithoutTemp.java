package BasicProblems;

import java.util.Scanner;

public class SwapTwoNumers_WithoutTemp {
    static void swaping(int a , int b){
        a = Math.abs(a+b);
        b = Math.abs(a-b);
        a = Math.abs(a-b);
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        int a = input.nextInt();
        System.out.println();

        System.out.print("Enter a 2nd number : ");
        int b = input.nextInt();
        System.out.println();

        swaping(a,b);
    }
}
