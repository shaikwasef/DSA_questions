// SORT COLORS
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.



class Solution {
    public void sortColors(int[] nums) {
        int l = 0 ;
        for(int i = 0 ; i <= 2 ; i ++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] == i){
                    int temp = nums[l];
                    nums[l] = nums[j];
                    nums[j] = temp;
                    l++ ;
                }
            }
        }
    }
}