class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        System.arraycopy(nums1, 0, nums, 0, m);
        System.arraycopy(nums2, 0, nums, m, n);
        Arrays.sort(nums);
        if((m +n) % 2 ==1){
            return nums[(m+n)/2];
        }else{
            return (nums[(m+n)/2]+ nums[(m+n)/2 - 1])/2.0 ;
        }

    }
}
