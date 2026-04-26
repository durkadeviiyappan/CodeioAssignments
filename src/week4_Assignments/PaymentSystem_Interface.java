package week4_Assignments;

import java.util.Scanner;

interface Payment{
    void pay();
    void refund();
}
class CreditCardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Pay through credit card");
    }
    @Override
    public void refund(){
        System.out.println("Refund through credit card");
    }
}
class UPI_Payment implements Payment{
    @Override
    public void pay(){
        System.out.println("Pay through UPI");
    }
    @Override
    public void refund(){
        System.out.println("Refund through UPI");
    }
}

public class PaymentSystem_Interface {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose payment mode (credit card(press c) or UPI(press u) )");
        char mode = sc.next().charAt(0);
        Payment p ;
        if(mode == 'c'){
            p = new CreditCardPayment();
            p.pay();
            p.refund();
        }
        else if(mode == 'u'){
            p = new UPI_Payment();
            p.pay();
            p.refund();
        }
    }
}
