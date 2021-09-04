//Leetcode 53

// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// A subarray is a contiguous part of an array.


class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0 ; i < nums .length ; i++){
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max,curr);
        }
        return max;
    }
}



