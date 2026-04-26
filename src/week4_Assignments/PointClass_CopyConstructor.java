package week4_Assignments;

class Point{
    int x , y ;
    Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    Point(Point o){
        this.x = o.x;
        this.y = o.y;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}

public class PointClass_CopyConstructor {
    public static void main(String[] args){
        Point p = new Point(12,12);

        System.out.println("copy 1 : ");
        Point p1 = new Point(p);

        System.out.println();

        System.out.println("copy 2 : ");
        Point p2 = new Point(p);

        System.out.println();

        System.out.println("copy 3 : ");
        Point p3 = new Point(p);

        System.out.println();

        //change value in copy 1
        p1.x = 13;
        System.out.println("x value in after change copy1 value : " + p1.x);

        System.out.println();

        System.out.println("copy 2 : x = " + p2.x);

        System.out.println();

        System.out.println("copy 2 : x = " + p3.x);

    }
}
