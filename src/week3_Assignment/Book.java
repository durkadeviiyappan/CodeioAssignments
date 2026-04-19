package week3_Assignment;

import java.util.*;

public class Book {
    String title ;
    String author ;
    int price ;

    Book(){

    }
    Book(String title , String author , int price){
        this.title = title ;
        this.author = author ;
        this.price = price ;
    }
    void displayBookDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Do you want any specific book? [if yes (Press y ) , no (Press n ) ]");
            char op = sc.next().charAt(0);

            sc.nextLine();

            if(op == 'y'){
                System.out.print("Book name : ");
                String book_name = sc.nextLine();

                System.out.print("Book Author : ");
                String boon_author = sc.nextLine();
                System.out.print("Book Price : ");
                int book_price = sc.nextInt();

                Book b1 = new Book(book_name , boon_author , book_price);
                b1.displayBookDetails();
            }
            else if(op == 'n'){
                Book b = new Book();
                b.displayBookDetails();
            }
            else{
                System.out.println("Invalid Operator");
            }
        }

    }
}
