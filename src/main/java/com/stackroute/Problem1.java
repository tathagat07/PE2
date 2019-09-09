package com.stackroute;

public class Problem1 {

    public int reverse( int num1){
        int rev = 0;
        int original;
        original = num1;
        int remainder;

        while(num1 !=0)
        {
            remainder = num1 % 10;
            rev = rev * 10 + remainder;
            num1 = num1/10;
        }
          return  rev;
        }
    }


