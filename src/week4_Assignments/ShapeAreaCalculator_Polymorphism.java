package week4_Assignments;

class Shape{
    double area(){
        System.out.println("Calculate area ");
        return 0 ;
    }
}
class Circle extends Shape{
    double radius ;
    Circle(double radius){
        this.radius = radius ;
    }
    @Override
    double area(){
        return Math.PI * radius * radius ;
    }
}
class Rectangle extends Shape{
    double length , width ;
    Rectangle(double length , double width){
        this.length = length ;
        this.width = width ;
    }
    @Override
    double area(){
        return length * width ;
    }
}
class Triangle extends Shape{
    double base , height ;
    Triangle(double base , double height){
        this.base = base ;
        this.height = height ;
    }
    double area(){
        return 0.5 * base * height ;
    }
}
public class ShapeAreaCalculator_Polymorphism {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(4,6);
        shapes[2] = new Triangle(3,8);

        for(Shape s : shapes){
            System.out.println("Area : " + s.area());
        }

    }
}
