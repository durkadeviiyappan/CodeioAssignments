package week4_Assignments;

class Students{
    String name;
    int rollNo;
    int marks;

    Students(String name , int rollNo , int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    Students(Students o){
        this.name = o.name;
        this.rollNo = o.rollNo;
        this.marks = o.marks;
    }
}
public class StudentRecord_CopyConstructor {
    public static void main(String[] args){
        Students s1 = new Students("Durka" , 12345 , 99);
        System.out.println("Name : " + s1.name);
        System.out.println("rollNo : " + s1.rollNo);
        System.out.println("Marks : " + s1.marks);

        System.out.println();

        Students s2 = new Students(s1);


        System.out.println();

        s2.name = "Devi";
        System.out.println("first object Name : " + s1.name);
        System.out.println("Second object name : " + s2.name);

    }
}
