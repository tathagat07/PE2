package com.stackroute;
import java.util.Scanner;
public class Student   {

    public Student() {
        // TODO Auto-generated constructor stub
    }
        int num;
        int[] marks;
        double average;
        int min;
        int max;

    public Student(int num, int[] marks) {
        this.num = num;
        this.marks = marks;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

//    void calculateAverage(int num, int marks[num]) {
//        double avg =  0.0;
//        int num;
//        int sum = 0;
//        int[] marks  = new int[num];
//        for (int i=0; i<num; i++)
//        {
//            sum = sum + marks[i];
//            avg = sum/num;
//        }
//        System.out.println("The average is = " + avg);
//    }

//    void calulateMaximum(int num, int marks[num]){
//        int [] marks;
//         int max;
//         max = marks[0];
//         for (int i=0 ; i<num ;i++)
//         {
//             if (max < marks[i])
//             {
//                 max = marks[i];
//             }
//         }
//        System.out.println("Maximum value:"+ max);
//    }

//    void calulateMinimum(int num, int marks[num]){
//        int [] marks;
//        int min;
//        min = marks[0];
//        for (int i=0 ; i<num ;i++)
//        {
//            if (min > marks[i])
//            {
//                min = marks[i];
//            }
//        }
//        System.out.println("Minimum value:"+ min);
//    }



    public static class StudentDetails
    {
        public static void main(String[] args)
        {   int num;
            int min;
            int max;
            int sum = 0;
            double avg = 0;

            Scanner sc = new Scanner (System.in);
            Student s = new Student();
            System.out.print(" Enter the number of students: ");
            num = sc.nextInt();
            int i = 0;
            int[] marks = new int[num];
           do{
               try{
                   for(int j=0; j< num; j++){
                       System.out.println("Enter the marks for student "+ (j+1) + "");
                       marks[j] = sc.nextInt();
                       if (marks[j] < 0 || marks[j] > 100)
                           throw new Exception("Enter the marks between 0 to 100");

                   }
               }
               catch (Exception e) {
                   System.out.println(e);
               }
           }while (marks[i] < 0 || marks[i] > 100);

            {
                max = marks[0];
                for(int j = 0; j < num; j++)
                {
                    if(max < marks[j])
                    {
                        max = marks[j];
                    }
                }
                System.out.println("The maximum marks obtained by any student = "+max);
            }

            {
                min = marks[0];
                for( int j = 0; j < num; j++)
                {
                    if(min > marks[j])
                    {
                        min = marks[j];
                    }
                }
                System.out.println("The minimum marks obtained by any student  = "+ min);
            }

            {
                for (int j=0; j<num; j++)
                {
                    sum = sum + marks[j];
                }
                avg = sum/num;
                System.out.println("The average marks obtained by the students is = " + avg);
            }

            sc.close();
        }
    }
}
