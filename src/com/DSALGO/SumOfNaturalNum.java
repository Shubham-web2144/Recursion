package com.DSALGO;

public class SumOfNaturalNum {

    public static void main(String[] args) {
        int sum = printSONR(15);
        System.out.println(sum);
    }
//    Approch 1 - without recursion
    static int printSON(int n){
        int curSum = 0;
        for(int i = 1; i <= n; i++) {
            curSum += i;
        }
        return curSum;
    }
//    Approch 2 - with recursion
    static int printSONR(int n) {
        if(n == 0) return 0;
        return (n+printSONR(n-1));

    }
}
