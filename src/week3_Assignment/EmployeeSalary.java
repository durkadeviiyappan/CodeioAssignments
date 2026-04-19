package week3_Assignment;

public class EmployeeSalary {
    private String name ;
    private int id ;
    private int salary;
     String getname(){
        return name;
    }
    int getSalary(){
        return salary;
    }
    int getId(){
        return id;
    }
    void setName(String name){
         this.name = name ;
     }
    void setSalary(int salary){
         this.salary = salary ;
     }
     void setId(int id ){
         this.id = id ;
     }

    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary();
        e.setId(12);
        e.setSalary(100000);
        e.setName("Durka");
        System.out.println(e.getname());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
     }
}
