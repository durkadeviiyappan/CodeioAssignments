package week1_Assignment;

public class BankBalanceCheck {
    static void checkBalance(int balance){
        String status = (balance > 0) ? "Positive Balance" : (balance < 0) ? "Overdraft" : "ZeroBalance";
        System.out.println(status);
    }
    public static void main(String[] args){
        int bankBalance = -98;
        checkBalance(bankBalance);
    }
}
