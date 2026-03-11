package week1_Assignment;

import java.util.* ;

public class Pass_Fail {
    static String scoreSystem(int mark){
        return((mark >= 50) ? "Pass" : "Fail");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mark out of 100 : ");
        int mark = input.nextInt();

        System.out.println(scoreSystem(mark));
    }
}
