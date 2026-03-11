package week1_Assignment;

import java.util.*;

public class RobotAssistant {
    static int calculator(int n1 , int n2 , char operator){
       switch(operator){
           case'+' :
               return n1+n2 ;


           case '-' :
               return n1-n2 ;


           case '*' :
               return n1*n2 ;


           case '/' :
               return n1/n2 ;


           case '%' :
               return n1%n2 ;


           default :
               System.out.println("Invalid operator ");
                return -1;
       }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n1 = input.nextInt();
        System.out.println();

        System.out.print("Enter 2nd number : ");
        int n2 = input.nextInt();
        System.out.println();

        System.out.print("Enter operator : ");
        char op = input.next().charAt(0);


        System.out.println("Result : " + calculator(n1,n2,op));
    }
}
