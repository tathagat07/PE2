package com.stackroute;
public class chessBoard {
    public static void main(String[] args) {

        System.out.println("My chess board ");
        int row = 8;
        int col = 8;
        int[][] board = new int[row][col];
        for (int i = 0; i < row; i++ ){
            for (int j = 0 ;j< col; j++){
                if ((i % 2 ==0 && j%2 ==0) || (i%2 !=0 && j%2!=0) ){
                    System.out.print("WW|" );
                }
                else
                    System.out.print("BB|");


            }
            System.out.println();
        }
    }
}
