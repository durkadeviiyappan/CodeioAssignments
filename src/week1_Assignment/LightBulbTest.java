package week1_Assignment;
import java.util.*;
public class LightBulbTest {
    public static void test(int n){
        if(n < 0){
            System.out.println("Invalid value");
        }
        else if(n%2 == 0){
            System.out.println("ON");
        }
        else{
            System.out.println("OFF");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value : ");
        int n = input.nextInt();
        test(n);

    }
}
