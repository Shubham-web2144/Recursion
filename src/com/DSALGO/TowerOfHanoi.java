package com.DSALGO;

public class TowerOfHanoi {
    static void towerOfHanoi(int disks, String firstTower, String secTower, String thirdTower) {
        if(disks <= 0) {
            return;
        }
        towerOfHanoi(disks-1,firstTower,thirdTower,secTower);
        System.out.println(disks +" is transferd to "+thirdTower+" from "+firstTower);
        towerOfHanoi(disks-1,secTower,firstTower,thirdTower);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,"A","B","C");
        System.out.println();
    }
}
