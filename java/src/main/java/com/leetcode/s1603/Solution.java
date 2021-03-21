package com.leetcode.s1603;

public class Solution {
    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(3,3, 3);
        
        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(3));
        System.out.println(ps.addCar(3));

    }
}   

class ParkingSystem {
    int big = 0, medium = 0, small = 0;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType){
            case  1:
                if(big <= 0) break;
                big--;
                return true;
            case  2:
                if(medium <=0) break;
                medium--;
                return true;
            case  3 :
                if(small <= 0) break;
                small--;
                return true;
            default:
                return false;

        }
        return false;
    }
}