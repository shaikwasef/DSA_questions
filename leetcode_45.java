class Solution {
    public int jump(int[] nums) {
        int currReach = 0 ;
        int maxReach = 0 ;
        int jumps = 0 ;
        int poss = 0 ;
        int i= 0;
        if(nums.length <=2 ){
            return nums.length - 1;
        }
        while(maxReach < nums.length-1 ){
            currReach = nums[i] + i ;
            if( currReach < nums.length-1 ){
                jumps++ ;
                for(int j = i + 1 ; j <= currReach ; j++){
                    if( maxReach < nums[j] + j){
                        maxReach = nums[j] + j;
                        poss = j ;
                    }
                }
            }else if ( currReach >= nums.length -1){
                return jumps + 1 ;
            }
            i = poss;
        }
        return jumps + 1 ;
    }
}

