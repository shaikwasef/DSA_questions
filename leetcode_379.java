// 349. Intersection of Two Arrays
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums1.length ; i++){
            set.add(nums1[i]);
        }
        List<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i < nums2.length ; i++){
            if(set.contains(nums2[i])){
                al.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[al.size()];
       for(int i = 0 ; i<al.size() ; i++){
           arr[i] = al.get(i);
       }
        
        return arr ;
    }
}