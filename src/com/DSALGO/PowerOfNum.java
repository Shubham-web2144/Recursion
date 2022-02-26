package com.DSALGO;

public class PowerOfNum {

    public static void main(String[] args) {
        System.out.println(powerStack(8,2));
    }
//    Problem 1 stack height is n
//    Approch 1 - power x^n with height of stack n;
//    Calcuate x^n
    static int power(int n, int p) {
        int pow = 1;
        while(p != 0) {
            pow = pow * n;
            p--;
        }
        return pow;
    }
//    Approch 2 - using recursion
    static int powerRec(int n, int p) {
        if(n == 0) return 0;
        if(p == 0) return 1;
        int pow = powerRec(n, p-1);
        return n*pow;
    }

//    Problem 2 stack height logn
    static int powerStack(int n, int p) {
        if(n == 0) return 0;
        if(p == 0) return 1;
        if(p%2 == 0) {
            return powerStack(n,p/2) * powerStack(n, p/2);
        }
        return ((powerStack(n,p/2) * powerStack(n,p/2))*n);
    }

}
