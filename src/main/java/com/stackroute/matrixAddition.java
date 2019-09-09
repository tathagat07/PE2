package com.stackroute;
import java.util.*;
import java.lang.Exception;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of rows of 1st matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Input the number of columns of 1st matrix: ");
        int col1 = sc.nextInt();
   do{
       try{

           System.out.println("Enter the elements of 1st matrix");
           int[][] matrix1 = new int[row1][col1];

           for(int i=0; i<row1; i++){
               for(int j = 0 ; j < col1; j++ )
               {
                   matrix1[i][j] = sc.nextInt();
               }
           }

           System.out.println("Enter the elements of 2nd matrix: ");

           int[][] matrix2 = new int[row1][col1];

           for(int i=0; i < row1; i++){
               for(int j = 0 ; j < col1; j++ )
               {
                   matrix1[i][j] = sc.nextInt();
               }
           }

           int[][] matrix3 = new int[row1][col1];

           for(int i =0; i< row1; i++)
           {
               for(int j=0; j< col1 ;j++){
                   matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
               }
           }
           System.out.println("Sum of the matrix is : ");
           for(int i =0; i< row1; i++)
           {
               for(int j=0; j< col1 ;j++){
                   System.out.println(matrix3[i][j] + "\t");
               }
               System.out.println();
           }
           if (row1 < 0 || col1 < 0)
               throw new Exception("Row and column value should be non negative. ");
       }
       catch (Exception e){
           System.out.println(e);

       }

   }while (row1 < 0 || col1 < 0);



       }


}
