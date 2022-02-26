package com.DSALGO;

public class Main {
//    print numbers from 1 to 5
    static void printNumbers(int n) {
        if(n == 0) return;
        System.out.print(n + " ");
        printNumbers(n-1);
    }
// print numbers in given number
    static void printNumberRang(int sn, int ln) {
        if(sn > ln) return;
        System.out.println(sn +" ");
        printNumberRang(sn+1,ln);
    }
//    natural numbers sum
    static int sumOfNaturalNum(int n) {
        if(n == 0) return 0;
        int sum = sumOfNaturalNum(n-1);
        return (n+sum);
    }
//    Factorial
    static int factorial(int n) {
        if(n == 1) return 1;
        if(n == 0) return 0;
        int facto = factorial(n-1);
        return (n*facto);
    }
    static void fibbSeq(int n, int x, int y) {
        if(n < x) {
            return;
        }
        int sum = x + y;
        System.out.println(sum);
        fibbSeq(n,y,sum);
    }
//    x^n problem stackHeight = n
    static int power(int x, int n) {
        if(n == 0) return 1;
        if(x == 0) return 0;
        int x_ = power(x,n-1);
        int xm = x*x_;
        return xm;
    }
    static int power1(int x,int n) {
        if(n == 0) return 1;
        if((n&1) == 0) {
            return (power1(x,n/2) * power1(x,n/2));
        }
        return (power1(x,n/2) * power1(x,n/2))*x;
    }
    public static void main(String[] args) {
	// write your code here
        printNumbers(5);
        printNumberRang(1,5);
        int sum = sumOfNaturalNum(5);
        System.out.println(sum);
        int facto = factorial(5);
        System.out.println(facto);
        System.out.println(0);
        System.out.println(1);
        fibbSeq(5,0,1);
        int power_n = power1(2,6);
        System.out.println(power_n);
    }
}
