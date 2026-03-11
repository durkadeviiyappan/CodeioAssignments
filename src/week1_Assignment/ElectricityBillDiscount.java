package week1_Assignment;

import java.util.Scanner;

public class ElectricityBillDiscount {
    static double payementSystem(int electricityBill){
        if(electricityBill > 1000){
            //give 10% discount
            return (electricityBill -( ((double)10)/100)*electricityBill);
        }
        else if(electricityBill > 500){
            //give 5% discount
            return (electricityBill - (((double)5)/100)*electricityBill);
        }
        else{
            return electricityBill;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your family electricity Bill :  ");
        int bill = input.nextInt();

        System.out.println("Pay : " + payementSystem(bill));
    }
}
