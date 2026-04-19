package week3_Assignment;

import java.util.*;

public class BankAccount {
    int accountNumber;
    int balance;
    int PIN;
    int user_PIN;

    BankAccount() {

    }

    BankAccount(int accountNumber, int PIN) {
        this.accountNumber = accountNumber;
        this.PIN = 1234;
        this.user_PIN = PIN;

    }

    String balance(int PIN) {
        return "Balance : " + balance;
    }

    String deposit(int amount) {
        balance += amount;
        return "Balance " + balance;
    }

    String withDraw(int user_PIN, int amount) {
        if (user_PIN == PIN) {
            if (amount < balance) {
                balance -= amount;
                return "Balance : " + balance;
            } else {
              return("Insuffincient balance ");
            }

        } else {
            return("Incorrect PIN");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Do you continue ? (Yes Press(y)) (No Press(n))");
            char c = sc.next().charAt(0);

         BankAccount b ;
            if(c == 'y'){
                System.out.print("Account Number : ");
                int accountNumber = sc.nextInt();
                System.out.print("PIN : ");
                int PIN = sc.nextInt();
                    b = new BankAccount(accountNumber,PIN);
                System.out.print("Operation ! (Deposit(Press d)) (WithDraw(Press w)) (CheckBalance(Press c))");
                char op = sc.next().charAt(0);
                int amt = 0 ;
                switch(op){
                    case'd':
                        System.out.print("Deposit amount : ");
                        amt = sc.nextInt();
                       System.out.println( b.deposit(amt));
                        break;
                    case'w' :
                        System.out.print("Withdraw amount : ");
                        amt = sc.nextInt();
                       System.out.println( b.withDraw(PIN,amt));
                        break ;
                    case'c' :
                        System.out.println(b.balance(PIN));
                        break;
                    default :
                        System.out.println("Enter valid operation");
                }
            }
            else if(c == 'n'){
               // b = new BankAccount();
                System.out.println("Exist");
                return;
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
