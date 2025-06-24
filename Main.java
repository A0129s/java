class Employee{
    private String name;
    private String ID;
    private double salary;

    // constructor
    public Employee(String n,String id,double s){
        name = n;
        ID = id;
        salary = s;
    }

    // accessor
    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public double getSalary(){
        return salary;
    }

    // MUTATOR
    public void setName(String n){
        name = n;
    }
    public void setID(String id){
        ID = id;
    }
    public void setSalary(double s){
        salary = s;
    }

}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("John","123",10000);
        System.out.println("Name: "+e.getName() +" ID: "+e.getID()+" Salary: "+e.getSalary());
    }
}