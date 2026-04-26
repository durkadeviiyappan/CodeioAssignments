package week4_Assignments;

import java.util.Scanner;

class Book{
    String title ;
    String author ;
    double price ;
}
class TextBook extends Book{
    void grade_10(){
        title = "Science";
        author = "Jackson";
        price = 250.00 ;

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
    void grade_11(){
        title = "Organic Chemistry";
        author = "Dr.Rathna";
        price = 350.00 ;

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
    void grade_12(){
        title = "Zoology Jungle";
        author = "Shiva Kumar";
        price = 450.00 ;

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}
class Magazine extends Book{
    void narutoEdition(){
        title = "Naruto Latest Edition";
        author = "shing chang ";
        price = 550.00 ;

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
    void shinchanEdition(){
        title = "Shinchan Latest Edition";
        author = "Nogara yugi";
        price = 530.00 ;

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
    void doraemonEdition(){
        title = "Doraemon Latest Edition";
        author = "kim yu tae young";
        price = 590.00 ;

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class LibrarySystem_Inheritance {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Which book you want (Text Book or Magazine)?");
       String book = sc.next();
       Book b ;
       if(book.equals("textBook")){
           b = new TextBook();
           TextBook t = (TextBook) b;

           System.out.println("Which grade book you want to need ? ");
           int grade = sc.nextInt();
           switch(grade){
               case 10 :
                   t.grade_10();
                   break;
               case 11 :
                   t.grade_11();
                   break;
               case 12 :
                   t.grade_12();
                   break;
               default :
                   System.out.println("Sorry!  this book we didn't have in stack");
           }
       }
       else if (book.equals("magazine")){
           b = new Magazine();
           Magazine m = (Magazine) b;
           System.out.println("Which Magazine you wanna need ?");
           String magazine = sc.next();
           switch(magazine){
               case "naruto" :
                   m.narutoEdition();
                   break;

               case "shinchan" :
                   m.shinchanEdition();
                   break;

               case "doraemon" :
                   m.doraemonEdition();
                   break;
           }
       }
   }
}
