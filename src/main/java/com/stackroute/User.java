package com.stackroute;

public class User {
    public User() {
    }
   private String fullName;
   private String firstName;
   private String lastname;
   private int age;
   private double salary;

    public User(String firstName, String lastname, int age, double salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void CheckAge(){
        if (age > 100 || age < 0)
        {
            System.out.println("Invalid age !");
        }
    }

    int isValidAge(int i){
        if (age > 18 && age < 60){
            return age;
        }

        else{
            return Integer.parseInt(null);
        }

    }

       public String getFullName(String firstName, String lastname){
        fullName = firstName +" "+ lastname;
        return fullName;
    }

}
