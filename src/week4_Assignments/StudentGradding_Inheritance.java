package week4_Assignments;

import java.util.Scanner;

class Person{
    String name;
    int age;
    Person(String name , int age){
        this.name = name ;
        this.age = age ;

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
class Student extends Person{
    int marks ;
    char grade ;
    Student(String name , int age , int marks , char grade) {
        super(name, age);
        this.marks = marks;
        this.grade = grade;

        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
    }

}
class GraduateStudent extends Student{
    String researchTopic;
    GraduateStudent(String name , int age , int marks , char grade , String researchTopic){
        super(name,age,marks,grade);
        this.researchTopic = researchTopic;

        System.out.println("Research Topic : " + researchTopic);
    }
}
public class StudentGradding_Inheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you Under Graduate Student(press u) or Graduate Student(press g) ? ");
        char status = sc.next().charAt(0);
        Person p ;
        if(status == 'u'){
            p = new Student("Durka",20,99,'o');
            Student s = (Student) p ;
        }
        else if(status == 'g'){
            p = new GraduateStudent("Durka" , 20 , 99 , 'o' , "Student Mentality");
            GraduateStudent g = (GraduateStudent) p ;
        }
    }
}
