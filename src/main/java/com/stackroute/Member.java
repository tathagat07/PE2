package com.stackroute;
import java.util.Scanner;
public class Member {
    public Member() {
    }

    String name;
    int age;
    double salary;

    public Member(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String displayDetails(){
          String str = name + age + salary;
          return str;
//        System.out.println( name);
//        System.out.println(age);
//        System.out.println( salary);
    }

//    public static class memberDetails{
//        public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//            Member m = new Member();
//            System.out.print(" Enter the member's name : ");
//            m.name = sc.next();
//            System.out.print("Enter the member's age: ");
//            m.age = sc.nextInt();
//            System.out.print("Enter the member's  salary: ");
//            m.salary = sc.nextDouble();
//
//            m.displayDetails();
//        }
//    }

}

