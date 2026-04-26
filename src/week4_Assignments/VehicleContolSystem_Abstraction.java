package week4_Assignments;

import java.util.* ;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
    }
    class Car extends Vehicle{
    @Override
        void start(){
        System.out.println("start car!");
    }
    @Override
        void stop(){
        System.out.println("stop car");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("start bike");
    }
    @Override
    void stop(){
        System.out.println("stop bike");
    }
}

public class VehicleContolSystem_Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which vehicle you choose whether Car or Bike ?");
        String vehicle = sc.next();
        Vehicle v;
        if (vehicle.equals("car")) {
            v = new Car();
            v.start();
            v.stop();
        } else if (vehicle.equals("bike") ) {
            v = new Bike();
            v.start();
            v.stop();
        }
    }

}
