// 189. Rotate Array
// Given an array, rotate the array to the right by k steps, where k is non-negative.

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length ;
        k = k % n ;
        //rotate from 0 to n-k-1
        nums = rotateArray(nums,0 , n-k-1);
        nums = rotateArray(nums,n-k,n-1);
        nums = rotateArray(nums , 0 , n - 1);
    }
    public static int[] rotateArray(int[] nums , int i , int j ){
        while ( i<= j ){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp ;
            i++;
            j--;
        }
        return nums;
    }
}