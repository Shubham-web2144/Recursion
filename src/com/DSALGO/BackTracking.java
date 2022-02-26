package com.DSALGO;


public class BackTracking {
    static void printAllCombination(String str, String perm) {
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printAllCombination(newStr, perm+currChar);
        }
    }
    public static void main(String args[]){
      String str = "AB";
      printAllCombination(str,"");
    }
}
