class Employee{
    private String name;
    private int empId;
    private double baseSalary;
    Employee(String name, int empId, Double baseSalary){
        this.name = name;
        this.empId=empId;
        this.baseSalary=baseSalary;
    }
    void displayEmployeeInfo(){
        System.out.println(name);
        System.out.println(empId);
        System.out.println(baseSalary);
    }
    double calculateSalary(double bouns){
        return baseSalary + bouns;
    }
    double getBaseSalary(){
        return baseSalary;
    }
    void displayRole(){}
}
class Developer extends Employee{
    private String programmingLanguage;
    private String role;
    Developer(String programmingLanguage, String role, String name ,int empId, Double baseSalary ){
          super(name, empId, baseSalary);
          this.programmingLanguage = programmingLanguage;
          this.role = role;

    }
    @Override
    void displayRole(){
        System.out.println("Role:"+" "+role );
        System.out.println("Language"+" "+programmingLanguage);
    }
}
class Manager extends Employee{
    private int teamSize;
    private String role;
    Manager(int teamSize, String role,String name, int empId, Double baseSalary ){
        super(name, empId, baseSalary);
        this.teamSize = teamSize;
        this.role = role;
    }
    @Override
    void displayRole(){
        System.out.println("Role:"+" "+role);
        System.out.println("Team Size:"+" "+teamSize);
    }
    
}
public class day2{
    public static void main(String[] args) {
        Employee e1 = new Employee("Prem", 1, 1500000.0);
        Employee e2 = new Developer("Java", "SDE", "Prem Sharma", 2, 1400000.0);
        Employee e3 = new Manager(3, "SWE", "Sharma", 3, 2000000.0);
        System.out.println(e1.calculateSalary(0));
        System.out.println(e3.calculateSalary(5000));
        e2.displayRole();
        e3.displayRole();

    }
}