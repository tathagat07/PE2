package com.stackroute;
import java.util.Scanner;
public class Employee {

    public Employee() {
        // TODO Auto-generated constructor stub
    }
    int EmpId;
    String name;
    String CompanyName;
    String Designation;
    float salary;
    String location;


    public Employee(int empId, String name, String companyName, String designation, float salary, String location)
    {

        EmpId = empId;
        this.name = name;
        CompanyName = companyName;
        Designation = designation;
        this.salary = salary;
        this.location = location;
    }


    public int getEmpId() {
        return EmpId;
    }


    public void setEmpId(int empId) {
        EmpId = empId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCompanyName() {
        return CompanyName;
    }


    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }


    public String getDesignation() {
        return Designation;
    }


    public void setDesignation(String designation) {
        Designation = designation;
    }


    public float getSalary() {
        return salary;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    void calculateSalary() {
        float salary;
        float basicPay = 40000 , ta= 5000 , da = 5000, pf = 200, it = 500;
        salary = basicPay +ta + da - it - pf;
        System.out.println(" Salary = " + salary);
    }


    void displayDetails() {
        System.out.println(" Employee Id: " + EmpId);
        System.out.println(" Employee name: " + name);
        System.out.println(" Company name: " + CompanyName);
        System.out.println(" Designation: "+ Designation);
        System.out.println(" Location: "+ location);

    }


    public static class StudentDetails
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            Employee s = new Employee();
            System.out.println(" Enter the employee id");
            s.EmpId = sc.nextInt();
            System.out.println(" Enter the employee name");
            s.name = sc.next();
            System.out.println("Enter the company name");
            s.CompanyName = sc.next();
            System.out.println("Enter the designation");
            s.Designation = sc.next();
            System.out.println("Enter the location");
            s.location = sc.next();

            s.displayDetails();
            s.calculateSalary();
            sc.close();
        }
    }
}
