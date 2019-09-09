package com.stackroute;
import java.util.*;
import java.lang.Exception;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = sc.nextInt();
        int[] stuGrades = new int[numOfStudents];
        int j = 1;
     do{
         try{

             for(int i = 0; i< numOfStudents; i++)
             {

                 {
                     System.out.println("enter the grade of student " + (i+1) + "");
                     stuGrades[i] = sc.nextInt();
                 }
                 if (stuGrades[i] < 0 || stuGrades[i] > 100)
                     throw new Exception("Enter the marks between 0 to 100");
             }

         }
         catch (Exception e)
         {
             System.out.println(e);
         }

     }
     while (stuGrades[j] < 0 || stuGrades[j] > 100 );

    }

}
