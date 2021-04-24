package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] test = new int[]{1, 2, 3, 4};
	    int[] newSum = runningSum(test);
        for(int i = 0; i < test.length; i++){
            System.out.print(newSum[i] + " ");
        }
    }
    public static int[] runningSum(int[] nums) { //returns the sum of an array up to i, EX: nums[1,2,3,4] -> output[1,3,6,10]

        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;

    }
}



