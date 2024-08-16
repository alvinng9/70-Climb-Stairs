package org.example;

public class Solution {
    public int climbStairs(int n) {
        //this is a fibonacci problem
        //deal with case with n equals 1
        if (n == 1) {
            return 1;
        }
        //set up an array to calculate each step to the top
        int[] result = new int[n + 1];
        //base case of 0 and 1
        result[0] = 1;
        result[1] = 1;
        //the next number equals to the sum of the last 2 numbers
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}
