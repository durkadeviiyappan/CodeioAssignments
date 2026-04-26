package week4_Assignments;

class Employee{
    double getBonus(){
        System.out.println("Bonus for employees");
        return 0;
    }
}
class Manager extends Employee{
    @Override
    double getBonus(){
        return 100000 ;
    }
}
class Developer extends Employee{
    @Override
    double getBonus(){
        return 80000 ;
    }
}
public class EmployeeBonusSystem_Polymorphism {
    public static void main(String[] args){
        Employee[] employee = {
                                new Manager(),
                                new Developer()
                                }  ;
        for(Employee e : employee){
            System.out.println("Bonus : " + e.getBonus());
        }
    }
}
