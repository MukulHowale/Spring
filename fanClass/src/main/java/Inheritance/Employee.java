package Inheritance;

import java.math.BigDecimal;

public class Employee extends Person{

    private String title;
    private String employerName;
    private char employeeGrade;
    private int salary;

    public Employee(String name){
        super(name);
//        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return title+"$"+employerName+"$"+salary+"$"+super.toString();
    }
}
