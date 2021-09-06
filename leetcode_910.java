class Solution {
    public int smallestRangeII(int[] A, int k) {
        Arrays.sort(A);
        int n = A.length;
        int ans = A[n-1] - A[0];
        for(int i = 0 ; i < n-1 ; i++){
            int j = i + 1 ;
            int max1 = Math.max(A[n-1] - k , A[i] + k);
            int min1 = Math.min(A[0]+k , A[j]-k);
            ans = Math.min(ans,max1 - min1);
        }
        return ans;
    }
}x