package Homework01;

public class Solution01 {
// max sum in a multidimensional array
    public int maximumWealth(int[][] accounts) {

        int max = 0;
       for(int i = 0; i < accounts.length; i++) {

           int sum = 0;
           for(int j = 0; j < accounts[0].length; j++)
               sum = sum + accounts[i] [j];
           max = Math.max(sum, max);
       }

  return max;  }
    }
