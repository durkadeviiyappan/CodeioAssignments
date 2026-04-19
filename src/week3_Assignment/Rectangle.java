package week3_Assignment;

import java.util.*;

public class Rectangle {
    double length ;
    double breadth ;
    double area ;
    double perimeter ;
    double calculateArea(double length , double breadth){
        return  length*breadth ;
    }
   double calculatePerimeter(double length , double breadth){
         return   (2 * (length + breadth)) ;
    }
    void display(double length , double  breadth){
        System.out.println("Area : " + calculateArea(length,breadth));
        System.out.println("Perimeter : " + calculatePerimeter(length , breadth));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("length of Rectangle(Float) : ");
        double length = sc.nextDouble();
        System.out.print("breadth of Rectangle(Float) : ");
        double breadth = sc.nextDouble();

        Rectangle r1 = new Rectangle();

        r1.display(length , breadth);

    }
}
