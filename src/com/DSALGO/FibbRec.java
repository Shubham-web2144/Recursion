package com.DSALGO;

public class FibbRec {

    public static void main(String[] args) {
        fibbSeqRec(16,0,1);
    }
//    Approch 1 - without recursion
    static void fibbSeq(int n) {
        int first_term = 0;
        int sec_term = 1;
        int sum = 0;
        while (n > first_term) {
            sum = first_term + sec_term;
            System.out.println(sum);
            first_term = sec_term;
            sec_term = sum;
        }
    }
//    Approch 2 - with recursion
static void fibbSeqRec(int n, int x, int y) {
    if(n < x) {
        return;
    }
    int sum = x + y;
    System.out.println(sum);
    fibbSeqRec(n,y,sum);
}
}
