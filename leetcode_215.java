// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}