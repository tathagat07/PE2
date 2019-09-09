package com.stackroute;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
     int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();

       try{
           c = b/a ;
           System.out.println(" c : " + c + " ");
           if (a == 0)
               throw new Exception("Can't divide by zero.");
       }
       catch (Exception e)
       {
           System.out.println(e);
       }

       finally {
           System.out.println("Finally block reached!");
       }



    }
}
