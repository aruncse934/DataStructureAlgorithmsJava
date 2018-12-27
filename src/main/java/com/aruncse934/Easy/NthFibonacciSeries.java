package com.aruncse934.Easy;

import java.util.Scanner;

public class NthFibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:::");
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
    //Recursive Method
    public static int fib(int n){
        if (n == 2)
            return 1;
        else if(n == 1)
            return 0;
        else
            return fib(n-1)+fib(n-2);
    }
}
