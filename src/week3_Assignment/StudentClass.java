package week3_Assignment;

import java.util.*;

public class StudentClass {
    String name;
    String rollNumber;
    int mark;

    StudentClass(String name, String rollNumber, int mark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mark = mark;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("rollNumber : " + rollNumber);
        System.out.println("mark : " + mark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Entry Student details(Press c) or Exit(Press e )");
            char op = sc.next().charAt(0);
            if (op == 'c') {
                System.out.print("Name : ");
                String name = sc.next();

                System.out.print("Roll number : ");
                String roll_num = sc.next();

                System.out.print("mark : ");
                int mark = sc.nextInt();
                StudentClass s = new StudentClass(name, roll_num, mark);
                s.display();
            } else if (op == 'e') {
                System.out.println("Exist");
                break;
            } else {
                System.out.println("Invalid operator");
                return;
            }


        }
    }
}