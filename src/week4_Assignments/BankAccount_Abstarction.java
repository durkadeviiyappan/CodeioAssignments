package week4_Assignments;

import java.util.Scanner ;

abstract class BankAccount{
    final double min_balance = 500 ;
    double balance = 0 ;
    abstract double deposit(double amount);
    abstract double withdraw(double amount);
}
class SavingAccount extends BankAccount{

    @Override
    double deposit(double amount){
        balance += amount ;
        return balance ;
    }
    @Override
    double withdraw(double amount){
        if(balance <= min_balance){
            return -1 ;
        }
        balance -= amount ;
        return balance ;
    }
}
class CurrentAccount extends BankAccount{
    @Override
   double deposit(double amount){
        balance += amount ;
        return balance ;
    }
    @Override
    double withdraw(double amount){
        if( amount <= min_balance ){
            return -1 ;
        }
        balance -= amount ;
        return balance ;
    }
}

public class BankAccount_Abstarction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("which account you use (current account(prees c) or savings account(press s)");
            char op = sc.next().charAt(0);
            char op2 ;
            double amount ;
            BankAccount b ;
            if (op == 'c') {
                b = new CurrentAccount();
                System.out.println("deposit(press d) or withdraw(prees w)");
                op2 = sc.next().charAt(0) ;
                if (op2 == 'd') {
                    System.out.println("Deposit amount : ");
                    amount = sc.nextDouble();
                    System.out.println(b.deposit(amount));
                }
                else{
                    System.out.println("Withdraw amount : ");
                    amount = sc.nextDouble();
                    System.out.println(b.withdraw(amount));
                }
            }
           else if (op == 's') {
                b = new SavingAccount();
                System.out.println("deposit(press d) or withdraw(prees w)");
                op2 = sc.next().charAt(0) ;
                if (op2 == 'd') {
                    System.out.println("Deposit amount : ");
                    amount = sc.nextDouble();
                    System.out.println(b.deposit(amount));
                }
                else{
                    System.out.println("Withdraw amount : ");
                    amount = sc.nextDouble();
                    System.out.println(b.withdraw(amount));
                }
            }
        }
    }
}
