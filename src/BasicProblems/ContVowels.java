package BasicProblems;

import java.util.*;

public class ContVowels {
    static int countVowels(String str) {
        if (str.length() <= 0) {
            System.out.println("Invalid string!");
            return -1;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' |
                    str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();

        System.out.println(countVowels(str));
    }
}
