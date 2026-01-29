package oop_lerning;

public class Employee {
    private int id;
    private String lastname;
    private String firstname;
    private int salary;

    //constructor
    public Employee(int id , String lastname, String firstname, int salary) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getName(){
        return this.lastname + "" + this.firstname;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary * 12;
    }
    public int raiseSalary(int percent){
        return (salary * percent)/100 + salary;
    }
    public String toString(){
        return "Employee [id ="+ this.id + ",name="+ getName() + ",salary="+ getSalary() + "]";
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Doe", 10000);
        System.out.println(e1.toString());
        System.out.println("ID : " + e1.id);
        System.out.println("Name : " + e1.getName());
        System.out.println("Salary : " + e1.getSalary());

    }



}
